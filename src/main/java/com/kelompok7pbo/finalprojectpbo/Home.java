package com.kelompok7pbo.finalprojectpbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumnModel;
import javax.swing.JTextField;

public class Home extends javax.swing.JFrame {
    private Connection connection;
    private static final Logger LOGGER = Logger.getLogger(Home.class.getName());
    private Map<Integer, Integer> articleIdMap = new HashMap<>();

    public Home(Connection connection) {
        this.connection = connection;
        initComponents();
        columnCustomization(this.jTable1);
        setVisible(true);
        setLocationRelativeTo(null);
        showTable("");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        jToggleButton1.setText("Dashboard");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Search..");

        jTextField1.setForeground(java.awt.Color.GRAY);
        jTextField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (jTextField1.getText().equals("Search..")) {
                    jTextField1.setText("");
                    jTextField1.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (jTextField1.getText().isEmpty()) {
                    jTextField1.setForeground(java.awt.Color.GRAY);
                    jTextField1.setText("Search..");
                }
            }
        });
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchTable(jTextField1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchTable(jTextField1.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                searchTable(jTextField1.getText());
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
                "No", "Title", "Content", "Category", "Date", "Action"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5;
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new Dashboard(this.connection);
    }

    private void showTable(String searchText) {
        try {
            String query = "SELECT a.*, c.NAMA_CATEGORY FROM articles a JOIN categories c ON a.CATEGORY_ID = c.CATEGORY_ID WHERE a.JUDUL_ARTICLE LIKE ? OR a.KONTEN_ARTICLE LIKE ? OR c.NAMA_CATEGORY LIKE ?";
            PreparedStatement pst = connection.prepareStatement(query);
            String searchPattern = "%" + searchText + "%";
            pst.setString(1, searchPattern);
            pst.setString(2, searchPattern);
            pst.setString(3, searchPattern);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            int rowIndex = 1;
            while (rs.next()) {
                int articleId = rs.getInt("ARTICLE_ID");
                articleIdMap.put(rowIndex - 1, articleId);
                Vector<Object> v2 = new Vector<>();
                v2.add(rowIndex);
                v2.add(rs.getString("JUDUL_ARTICLE"));
                v2.add(rs.getString("KONTEN_ARTICLE"));
                v2.add(rs.getString("NAMA_CATEGORY"));
                v2.add(rs.getString("TANGGAL_ARTICLE"));
                v2.add("View");

                DFT.addRow(v2);
                rowIndex++;
            }
            rs.close();
            pst.close();

            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(5).setCellRenderer(new ButtonRenderer());
            columnModel.getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    private void searchTable(String searchText) {
        showTable(searchText);
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "View" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;
        private int row;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    dispose();
                    int articleId = articleIdMap.get(row);
                    new ShowArticle(articleId, connection).setVisible(true);
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "View" : value.toString();
            button.setText(label);
            isPushed = true;
            this.row = row;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                // Do something when button is clicked
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

<<<<<<< HEAD
    public static void columnCustomization(JTable table) {
        // Get the table column model
        TableColumnModel columnModel = table.getColumnModel();

        if (columnModel.getColumnCount() >= 1) {
            TableColumn firstNameColumn = columnModel.getColumn(0);
            firstNameColumn.setPreferredWidth(30); // Preferred width
            firstNameColumn.setMinWidth(20); // Minimum width
            firstNameColumn.setMaxWidth(50); // Maximum width
            TableColumn secondNameColumn = columnModel.getColumn(1);
            secondNameColumn.setPreferredWidth(150); // Preferred width
            secondNameColumn.setMinWidth(100); // Minimum width
            secondNameColumn.setMaxWidth(180); // Maximum width
            TableColumn thirdtNameColumn = columnModel.getColumn(2);
            thirdtNameColumn.setPreferredWidth(180); // Preferred width
            thirdtNameColumn.setMinWidth(150); // Minimum width
            thirdtNameColumn.setMaxWidth(200); // Maximum width
            TableColumn fourthNameColumn = columnModel.getColumn(3);
            fourthNameColumn.setPreferredWidth(80); // Preferred width
            fourthNameColumn.setMinWidth(50); // Minimum width
            fourthNameColumn.setMaxWidth(100); // Maximum width
            TableColumn fifthNameColumn = columnModel.getColumn(4);
            fifthNameColumn.setPreferredWidth(110); // Preferred width
            fifthNameColumn.setMinWidth(90); // Minimum width
            fifthNameColumn.setMaxWidth(150); // Maximum width
            TableColumn sixthNameColumn = columnModel.getColumn(5);
            sixthNameColumn.setPreferredWidth(60); // Preferred width
            sixthNameColumn.setMinWidth(40); // Minimum width
            sixthNameColumn.setMaxWidth(80); // Maximum width
        }

        // Iterate through each column and set resizable to false
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            column.setResizable(false);
        }

        // Create a custom cell renderer
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        // Apply the custom renderer to all columns
        TableColumnModel columnModelCenterer = table.getColumnModel();
        for (int i = 0; i < columnModelCenterer.getColumnCount(); i++) {
            columnModelCenterer.getColumn(i).setCellRenderer(centerRenderer);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
=======
    // Variables declaration - do not modify                     
>>>>>>> ebf0e7677ccc4558cbf83ded08079eac535fb123
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration                   
}

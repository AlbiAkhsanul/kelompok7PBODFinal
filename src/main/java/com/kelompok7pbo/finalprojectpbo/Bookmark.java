/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok7pbo.finalprojectpbo;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Windows 11
 */
public class Bookmark extends javax.swing.JFrame {
    private Connection connection;
    private int userId;
    private static final Logger LOGGER = Logger.getLogger(Home.class.getName());
    private Map<Integer, Integer> bookmarkIdMap = new HashMap<>();
    private Map<Integer, Integer> articleIdMap = new HashMap<>();

    /**
     * Creates new form Bookmark
     */
    public Bookmark(Connection connection, int userId) {
        this.connection = connection;
        this.userId = userId;
        initComponents();
        jTable1.setRowHeight(30);
        columnCustomization(this.jTable1);
        setVisible(true);
        setLocationRelativeTo(null);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonMyArticle = new javax.swing.JButton();
        buttonDashboard = new javax.swing.JButton();
        buttonBookmark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null }
                },
                new String[] {
                        "No", "Judul", "Kategori", "Author", "Aksi"
                }));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 210));

        jPanel3.setBackground(new java.awt.Color(221, 221, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 100, -1));

        buttonMyArticle.setText("Artikel Saya");
        buttonMyArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMyArticleActionPerformed(evt);
            }
        });
        jPanel3.add(buttonMyArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, 100, -1));

        buttonDashboard.setText("Dashboard");
        buttonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDashboardActionPerformed(evt);
            }
        });
        jPanel3.add(buttonDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 100, -1));

        buttonBookmark.setText("Bookmark");
        buttonBookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookmarkActionPerformed(evt);
            }
        });
        jPanel3.add(buttonBookmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 594,
                                                Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonHomeActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }// GEN-LAST:event_buttonHomeActionPerformed

    private void buttonMyArticleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonMyArticleActionPerformed
        dispose();
        new MyArticles(this.connection, this.userId);
    }// GEN-LAST:event_buttonMyArticleActionPerformed

    private void buttonDashboardActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonDashboardActionPerformed
        dispose();
        new Dashboard(this.connection, this.userId);
    }// GEN-LAST:event_buttonDashboardActionPerformed

    private void buttonBookmarkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonBookmarkActionPerformed
        dispose();
        new Bookmark(this.connection, this.userId);
    }// GEN-LAST:event_buttonBookmarkActionPerformed

    private void showTable() {
        try {
            String query = "SELECT b.*, a.USER_ID, u.USERNAME, c.NAMA_CATEGORY FROM bookmarks b JOIN articles a ON b.ARTICLE_ID = a.ARTICLE_ID JOIN users u ON a.USER_ID JOIN categories c ON a.CATEGORY_ID = c.CATEGORY_ID  = u.USER_ID WHERE b.USER_ID = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            int rowIndex = 1;
            while (rs.next()) {
                int bookmarkId = rs.getInt("BOOKMARK_ID");
                int articleId = rs.getInt("ARTICLE_ID");
                bookmarkIdMap.put(rowIndex - 1, bookmarkId);
                articleIdMap.put(rowIndex - 1, articleId);
                Vector<Object> v2 = new Vector<>();
                v2.add(rowIndex);
                v2.add(rs.getString("JUDUL_BOOKMARK"));
                v2.add(rs.getString("NAMA_CATEGORY"));
                v2.add(rs.getString("USERNAME"));
                v2.add("Aksi");

                DFT.addRow(v2);
                rowIndex++;
            }
            rs.close();
            pst.close();

            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(4).setCellRenderer(new ButtonRenderer());
            columnModel.getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    class ButtonRenderer extends JPanel implements TableCellRenderer {
        public ButtonRenderer() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
            JButton viewButton = new JButton("View");
            JButton deleteButton = new JButton("Delete");

            add(viewButton);
            add(deleteButton);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        protected JPanel panel;
        protected JButton viewButton;
        protected JButton editButton;
        protected JButton deleteButton;
        private int row;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
            viewButton = new JButton("View");
            deleteButton = new JButton("Delete");

            panel.add(viewButton);
            panel.add(deleteButton);

            viewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    dispose();
                    int articleId = articleIdMap.get(row);
                    new ShowArticle(articleId, connection, userId).setVisible(true);
                }
            });

            deleteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    int bookmarkId = bookmarkIdMap.get(row);
                    int dialogResult = JOptionPane.showConfirmDialog(panel,
                            "Apakah Anda Yakin Ingin Menghapus Bookmark Ini?",
                            "Konfirmasi Hapus",
                            JOptionPane.YES_NO_OPTION);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        try {
                            String sql = "DELETE FROM bookmarks WHERE BOOKMARK_ID = ?";
                            PreparedStatement statement = connection.prepareStatement(sql);
                            statement.setInt(1, bookmarkId);

                            int rowsDeleted = statement.executeUpdate();
                            if (rowsDeleted > 0) {
                                JOptionPane.showMessageDialog(panel, "Bookmark Berhasil Dihapus!",
                                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                showTable(); // Perbarui tabel setelah penghapusan
                            } else {
                                JOptionPane.showMessageDialog(panel, "Bookmark Gagal Dihapus!",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                            statement.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(MyArticles.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            this.row = row;
            return panel;
        }

        @Override
        public Object getCellEditorValue() {
            return null;
        }

        @Override
        public boolean stopCellEditing() {
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

    public static void columnCustomization(JTable table) {
        // Get the table column model
        TableColumnModel columnModel = table.getColumnModel();

        if (columnModel.getColumnCount() >= 3) {
            TableColumn firstNameColumn = columnModel.getColumn(0);
            firstNameColumn.setPreferredWidth(30); // Preferred width
            firstNameColumn.setMinWidth(20); // Minimum width
            firstNameColumn.setMaxWidth(50); // Maximum width
            TableColumn secondNameColumn = columnModel.getColumn(1);
            secondNameColumn.setPreferredWidth(170); // Preferred width
            secondNameColumn.setMinWidth(150); // Minimum width
            secondNameColumn.setMaxWidth(190); // Maximum width
            TableColumn thirdNameColumn = columnModel.getColumn(2);
            thirdNameColumn.setPreferredWidth(80); // Preferred width
            thirdNameColumn.setMinWidth(50); // Minimum width
            thirdNameColumn.setMaxWidth(100); // Maximum width
            TableColumn fourthNameColumn = columnModel.getColumn(3);
            fourthNameColumn.setPreferredWidth(140); // Preferred width
            fourthNameColumn.setMinWidth(120); // Minimum width
            fourthNameColumn.setMaxWidth(160); // Maximum width
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
    private javax.swing.JButton buttonBookmark;
    private javax.swing.JButton buttonDashboard;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMyArticle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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

import static javax.swing.UIManager.getInt;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author albia
 */
public class MyArticles extends javax.swing.JFrame {

    private Connection connection;
    private int userId;
    private static final Logger LOGGER = Logger.getLogger(Home.class.getName());
    private Map<Integer, Integer> articleIdMap = new HashMap<>();

    /**
     * Creates new form Dashoard
     */
    public MyArticles(Connection connection, int userId) {
        this.connection = connection;
        this.userId = userId;
        initComponents();
        jTable1.setRowHeight(30);
        columnCustomization(this.jTable1);
        setVisible(true);
        manageArticles.setVisible(false);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        manageArticles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Buat Article");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Artikel Saya");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Dashboard");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bookmark");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        manageArticles.setText("Manage Artikel");
        manageArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageArticlesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageArticles, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Judul", "Kategori", "Tanggal", "Status", "Aksi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PintarPedia (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("My Articles");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageArticlesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_manageArticlesActionPerformed
        dispose();
        new ManageArticles(this.connection, this.userId);
    }// GEN-LAST:event_manageArticlesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        new Bookmark(this.connection, this.userId);
    }// GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new CreateArticle(this.connection, this.userId);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new MyArticles(this.connection, this.userId);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        new Dashboard(this.connection, this.userId);
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }// GEN-LAST:event_jButton3ActionPerformed

    private void showTable() {
        try {
            String query = "SELECT a.*, c.NAMA_CATEGORY FROM articles a JOIN categories c ON a.CATEGORY_ID = c.CATEGORY_ID WHERE a.USER_ID = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, userId);
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
                v2.add(rs.getString("NAMA_CATEGORY"));
                v2.add(rs.getString("TANGGAL_ARTICLE"));
                v2.add(rs.getString("STATUS_ARTICLE"));
                v2.add("Aksi");

                DFT.addRow(v2);
                rowIndex++;
            }
            rs.close();
            pst.close();

            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(5).setCellRenderer(new ButtonRenderer());
            columnModel.getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));

            String adminQuery = "SELECT IS_ADMIN FROM users WHERE USER_ID = ?";
            PreparedStatement adminPST = connection.prepareStatement(adminQuery);
            adminPST.setInt(1, this.userId); // Change to the correct parameter index
            ResultSet adminRS = adminPST.executeQuery();

            if (adminRS.next()) {
                int is_admin = adminRS.getInt("IS_ADMIN"); // Use correct method to retrieve int

                if (is_admin == 1) {
                    manageArticles.setVisible(true); // Show the button if user is admin
                }
            }

            adminRS.close();
            adminPST.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    class ButtonRenderer extends JPanel implements TableCellRenderer {
        private int row; // tambahkan deklarasi variabel row di sini

        public ButtonRenderer() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
            JButton viewButton = new JButton("View");
            JButton editButton = new JButton("Edit");
            JButton deleteButton = new JButton("Delete");

            add(viewButton);
            add(editButton);
            add(deleteButton);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            this.row = row;
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
            editButton = new JButton("Edit");
            deleteButton = new JButton("Delete");

            panel.add(viewButton);
            panel.add(editButton);
            panel.add(deleteButton);

            // Logika aksi untuk tombol View, Edit, dan Delete tetap sama seperti sebelumnya
            viewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    dispose();
                    int articleId = articleIdMap.get(row); // Mendapatkan articleId dari indeks baris
                    new ShowArticle(articleId, connection, userId).setVisible(true);
                }
            });

            editButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    try {
                        int articleId = articleIdMap.get(row);
                        String statusQuery = "SELECT STATUS_ARTICLE FROM articles WHERE ARTICLE_ID = ?";
                        PreparedStatement statusPST = connection.prepareStatement(statusQuery);
                        statusPST.setInt(1, articleId);
                        ResultSet statusRS = statusPST.executeQuery();

                        if (statusRS.next()) {
                            String status = statusRS.getString("STATUS_ARTICLE");

                            if (status.equals("Pending")) {
                                dispose();
                                new EditArticle(articleId, connection, userId).setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(MyArticles.this,
                                        "Tidak Dapat Mengedit Article Yang Sudah Di Publish!", "ERROR",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } catch (SQLException ex) {
                        LOGGER.log(Level.SEVERE, null, ex);
                    }
                }
            });

            deleteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    int articleId = articleIdMap.get(row);
                    int dialogResult = JOptionPane.showConfirmDialog(panel,
                            "Apakah Anda Yakin Ingin Menghapus Artikel Ini?", "Konfirmasi Hapus",
                            JOptionPane.YES_NO_OPTION);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        try {
                            String sql = "DELETE FROM articles WHERE ARTICLE_ID = ?";
                            PreparedStatement statement = connection.prepareStatement(sql);
                            statement.setInt(1, articleId);

                            int rowsDeleted = statement.executeUpdate();
                            if (rowsDeleted > 0) {
                                JOptionPane.showMessageDialog(panel, "Artikel Berhasil Dihapus!",
                                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                showTable(); // Perbarui tabel setelah penghapusan
                            } else {
                                JOptionPane.showMessageDialog(panel, "Gagal Menghapus Artikel!",
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

        if (columnModel.getColumnCount() >= 5) {
            TableColumn firstNameColumn = columnModel.getColumn(0);
            firstNameColumn.setPreferredWidth(30); // Preferred width
            firstNameColumn.setMinWidth(20); // Minimum width
            firstNameColumn.setMaxWidth(50); // Maximum width
            TableColumn secondNameColumn = columnModel.getColumn(1);
            secondNameColumn.setPreferredWidth(150); // Preferred width
            secondNameColumn.setMinWidth(100); // Minimum width
            secondNameColumn.setMaxWidth(180); // Maximum width
            TableColumn thirdNameColumn = columnModel.getColumn(2);
            thirdNameColumn.setPreferredWidth(80); // Preferred width
            thirdNameColumn.setMinWidth(50); // Minimum width
            thirdNameColumn.setMaxWidth(100); // Maximum width
            TableColumn fourthNameColumn = columnModel.getColumn(3);
            fourthNameColumn.setPreferredWidth(150); // Preferred width
            fourthNameColumn.setMinWidth(120); // Minimum width
            fourthNameColumn.setMaxWidth(160); // Maximum width
            TableColumn fifthNameColumn = columnModel.getColumn(4);
            fifthNameColumn.setPreferredWidth(80); // Preferred width
            fifthNameColumn.setMinWidth(50); // Minimum width
            fifthNameColumn.setMaxWidth(100); // Maximum width
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton manageArticles;
    // End of variables declaration//GEN-END:variables
}

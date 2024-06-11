/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok7pbo.finalprojectpbo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class EditProfile extends javax.swing.JFrame {

    private Connection connection;
    private int userId;

    /**
     * Creates new form EditProfile
     * 
     * @param connection
     * @param userId
     */
    public EditProfile(Connection connection, int userId) {
        this.connection = connection;
        this.userId = userId;
        initComponents();
        loadUserData();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private EditProfile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadUserData() {
        try {
            String query = "SELECT NAMA, USERNAME, EMAIL, PASSWORD FROM users WHERE USER_ID = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, userId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        jTextField1.setText(resultSet.getString("NAMA"));
                        jTextField2.setText(resultSet.getString("USERNAME"));
                        jTextField3.setText(resultSet.getString("EMAIL"));
                        jPasswordField1.setText(resultSet.getString("PASSWORD"));
                        jPasswordField2.setText(resultSet.getString("PASSWORD"));
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data pengguna: " + e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonMyArticle = new javax.swing.JButton();
        buttonDashboard = new javax.swing.JButton();
        buttonBookmark = new javax.swing.JButton();
        buttonBookmark1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 284, -1));

        jPasswordField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 284, -1));

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 284, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Konfirmasi Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, -1));

        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 284, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Edit Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 140, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Nama Lengkap");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 70, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 37, -1));

        jPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 284, -1));

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setText("Home");
        buttonHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 130, 30));

        buttonMyArticle.setText("Artikel Saya");
        buttonMyArticle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMyArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMyArticleActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMyArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        buttonDashboard.setText("Dashboard");
        buttonDashboard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));

        buttonBookmark.setText("Profile");
        buttonBookmark.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonBookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookmarkActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBookmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 30));

        buttonBookmark1.setText("Bookmark");
        buttonBookmark1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonBookmark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookmark1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBookmark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 480));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PintarPedia (1).png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 110));

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("EDIT PROFILE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 70));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonMyArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMyArticleActionPerformed
        dispose();
        new MyArticles(this.connection, this.userId);
    }//GEN-LAST:event_buttonMyArticleActionPerformed

    private void buttonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDashboardActionPerformed
        dispose();
        new Dashboard(this.connection, this.userId);
    }//GEN-LAST:event_buttonDashboardActionPerformed

    private void buttonBookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookmarkActionPerformed
        dispose();
        new Profile(this.connection, this.userId);
    }//GEN-LAST:event_buttonBookmarkActionPerformed

    private void buttonBookmark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookmark1ActionPerformed
        dispose();
        new Bookmark(this.connection, this.userId);
    }//GEN-LAST:event_buttonBookmark1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        try {
            String namaLengkap = jTextField1.getText();
            String username = jTextField2.getText();
            String email = jTextField3.getText();
            String password = new String(jPasswordField1.getPassword());
            String confirmPassword = new String(jPasswordField2.getPassword());

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Password dan konfirmasi password tidak sama!", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "UPDATE users SET NAMA = ?, USERNAME = ?, EMAIL = ?, PASSWORD = ? WHERE USER_ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, namaLengkap);
            statement.setString(2, username);
            statement.setString(3, email);
            statement.setString(4, password);
            statement.setInt(5, userId);

            int rowsUpdated = statement.executeUpdate();
            statement.close();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Profil berhasil diupdate!", "SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Profile(this.connection, this.userId);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengupdate profil!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mengupdate profil!\n\n" + e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        new Profile(this.connection, this.userId);
        dispose();
    }// GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // Create a connection object here and pass it along with the userId
            Connection connection = null; // Replace this with your actual connection object
            int userId = 1; // Replace this with the actual user ID
            new EditProfile().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBookmark;
    private javax.swing.JButton buttonBookmark1;
    private javax.swing.JButton buttonDashboard;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMyArticle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

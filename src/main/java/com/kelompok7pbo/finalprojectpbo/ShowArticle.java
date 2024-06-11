/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok7pbo.finalprojectpbo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static javax.swing.UIManager.getString;

/**
 *
 * @author albia
 */
public class ShowArticle extends javax.swing.JFrame {
    private Connection connection;
    private int articleId;
    private int userId;

    /**
     * Creates new form ShowArticle
     */
    public ShowArticle(int articleId, Connection connection, int userId) {
        this.connection = connection;
        this.articleId = articleId;
        this.userId = userId;
        initComponents();
        setVisible(true);
        bookmarkButton.setVisible(false);
        setLocationRelativeTo(null);
        loadArticleContent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookmarkButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonMyArticle = new javax.swing.JButton();
        buttonDashboard = new javax.swing.JButton();
        buttonBookmark = new javax.swing.JButton();
        buttonBookmark1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Author");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setText("Konten");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Judul");

        bookmarkButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        bookmarkButton.setText("Tambahkan Ke Bookmark");
        bookmarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookmarkButtonActionPerformed(evt);
            }
        });

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

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PintarPedia (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 110));

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("TAMPILKAN ARTIKEL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 500, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookmarkButton)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookmarkButton)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDashboardActionPerformed
        dispose();
        new Dashboard(this.connection, this.userId);
    }//GEN-LAST:event_buttonDashboardActionPerformed

    private void buttonMyArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMyArticleActionPerformed
        dispose();
        new MyArticles(this.connection, this.userId);
    }//GEN-LAST:event_buttonMyArticleActionPerformed

    private void buttonBookmark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookmark1ActionPerformed
        dispose();
        new Bookmark(this.connection, this.userId);
    }//GEN-LAST:event_buttonBookmark1ActionPerformed

    private void buttonBookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookmarkActionPerformed
        dispose();
        new Profile(this.connection, this.userId);
    }//GEN-LAST:event_buttonBookmarkActionPerformed

    private void bookmarkButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        try {
            String query = "SELECT * FROM articles WHERE ARTICLE_ID = ?";
            PreparedStatement pst = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE);
            pst.setInt(1, articleId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int category_id = rs.getInt("CATEGORY_ID");
                String judul_bookmark = rs.getString("JUDUL_ARTICLE");
                String konten_bookmark = rs.getString("KONTEN_ARTICLE");

                // Mendapatkan tanggal dan waktu saat ini
                LocalDateTime now = LocalDateTime.now();

                // Mendefinisikan format yang diinginkan
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Memformat tanggal dan waktu saat ini
                String createdAt = now.format(formatter);

                String sql = "INSERT INTO bookmarks (ARTICLE_ID, USER_ID, CATEGORY_ID, JUDUL_BOOKMARK,KONTEN_BOOKMARK, TANGGAL_BOOKMARK) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, articleId);
                statement.setInt(2, userId);
                statement.setInt(3, category_id);
                statement.setString(4, judul_bookmark);
                statement.setString(5, konten_bookmark);
                statement.setString(6, createdAt);

                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    statement.close();
                    JOptionPane.showMessageDialog(this, "Bookmark berhasil ditambahkan!", "SUCCESS",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new ShowArticle(this.articleId, this.connection, this.userId);
                } else {
                    statement.close();
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan bookmark!", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(this, "Artikel tidak ditemukan!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void loadArticleContent() {
        try {
            String query = "SELECT a.*, c.NAMA_CATEGORY, u.USERNAME FROM articles a JOIN categories c ON a.CATEGORY_ID = c.CATEGORY_ID JOIN users u ON a.USER_ID = u.USER_ID WHERE a.ARTICLE_ID = ?";
            PreparedStatement pst = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE);
            pst.setInt(1, articleId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                jLabel3.setText(rs.getString("JUDUL_ARTICLE"));
                String info = "Author : " + rs.getString("USERNAME") + " di kategori " +
                        rs.getString("NAMA_CATEGORY");

                jLabel1.setText(info);
                String content = "<html> " + rs.getString("KONTEN_ARTICLE") + " </html>";
                jLabel2.setText(content);

                int articleUserId = rs.getInt("USER_ID");
                if (this.userId != articleUserId) {
                    String bookmarkQuery = "SELECT COUNT(*) FROM bookmarks WHERE ARTICLE_ID = ? AND USER_ID = ?";
                    PreparedStatement bookmarkPst = connection.prepareStatement(bookmarkQuery);
                    bookmarkPst.setInt(1, articleId);
                    bookmarkPst.setInt(2, this.userId);
                    ResultSet bookmarkRs = bookmarkPst.executeQuery();

                    if (bookmarkRs.next()) {
                        int count = bookmarkRs.getInt(1);
                        if (count == 0) {
                            bookmarkButton.setVisible(true); // Show the button if not already bookmarked
                        }
                    }
                }
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookmarkButton;
    private javax.swing.JButton buttonBookmark;
    private javax.swing.JButton buttonBookmark1;
    private javax.swing.JButton buttonDashboard;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMyArticle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 599,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Home(this.connection, this.userId);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void loadArticleContent() {
        System.out.println("Jalan Artikel : " + articleId);
        try {
            String query = "SELECT c.NAMA_CATEGORY, a.JUDUL_ARTICLE, a.KONTEN_ARTICLE, u.USERNAME FROM articles a JOIN categories c ON a.CATEGORY_ID = c.CATEGORY_ID JOIN users u ON a.USER_ID = u.USER_ID WHERE a.ARTICLE_ID = ?";
            PreparedStatement pst = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE);
            pst.setInt(1, articleId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                jLabel3.setText(rs.getString("JUDUL_ARTICLE"));
                String info = "by: " + rs.getString("USERNAME") + " in category " +
                        rs.getString("NAMA_CATEGORY");

                jLabel1.setText(info);
                String content = "<html> " + rs.getString("KONTEN_ARTICLE") + " </html>";
                jLabel2.setText(content);
                // DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                // model.setRowCount(0);

                // Object[] row = {
                // rs.getString("KONTEN_ARTICLE"),
                // };
                // model.addRow(row);

                // System.out.println("Nama Kategori: " + rs.getString("NAMA_CATEGORY"));
                // System.out.println("Judul Artikel: " + rs.getString("JUDUL_ARTICLE"));
                // System.out.println("Konten Artikel: " + rs.getString("KONTEN_ARTICLE"));
                // System.out.println("Nama Pengguna: " + rs.getString("NAMA"));
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
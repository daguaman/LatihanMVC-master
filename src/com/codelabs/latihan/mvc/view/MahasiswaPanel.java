/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MahasiswaPanel.java
 *
 * Created on Jun 9, 2012, 12:19:49 PM
 */
package com.codelabs.latihan.mvc.view;

import com.codelabs.latihan.mvc.controller.MahasiswaController;
import com.codelabs.latihan.mvc.entities.MahasiswaEntity;
import com.codelabs.latihan.mvc.listener.MahasiswaListener;
import com.codelabs.latihan.mvc.model.MahasiswaModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hendri
 */
public class MahasiswaPanel extends javax.swing.JPanel implements MahasiswaListener {

    private MahasiswaModel model;
    private MahasiswaController controller;

    /** Creates new form MahasiswaPanel */
    public MahasiswaPanel() {
        initComponents();
        
        model = new MahasiswaModel();
        controller = new MahasiswaController();
        
        model.setListener(this);
        controller.setModel(model);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCari = new javax.swing.JButton();

        jLabel1.setText("Nim");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        jScrollPane1.setViewportView(textAreaAlamat);

        buttonInsert.setText("insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdate.setText("update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JTextArea getTextAreaAlamat() {
        return textAreaAlamat;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public JTextField getTextNim() {
        return textNim;
    }

private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
// TODO add your handling code here:
    controller.prosesInsert(this);
}//GEN-LAST:event_buttonInsertActionPerformed

private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
// TODO add your handling code here:
    controller.prosesUpdate(this);
}//GEN-LAST:event_buttonUpdateActionPerformed

private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
// TODO add your handling code here:
    controller.prosesDelete(this);
}//GEN-LAST:event_buttonDeleteActionPerformed

private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
// TODO add your handling code here:
    controller.prosesCari(this);
}//GEN-LAST:event_buttonCariActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertMahasiswa(MahasiswaEntity mahasiswa) {
        textNim.setText(mahasiswa.getNim());
        textNama.setText(mahasiswa.getNama());
        textAreaAlamat.setText(mahasiswa.getAlamat());
    }

    @Override
    public void updateMahasiswa(MahasiswaEntity mahasiswa) {
        textNim.setText(mahasiswa.getNim());
        textNama.setText(mahasiswa.getNama());
        textAreaAlamat.setText(mahasiswa.getAlamat());
    }

    @Override
    public void deleteMahasiswa(MahasiswaEntity mahasiswa) {
        textNim.setText(mahasiswa.getNim());
        textNama.setText(mahasiswa.getNama());
        textAreaAlamat.setText(mahasiswa.getAlamat());
    }

    @Override
    public void cariMahasiswa(MahasiswaEntity mahasiswa) {
        if (mahasiswa == null) {
            JOptionPane.showMessageDialog(null, "Maaf Nim yang anda cari tidak ditemukan..");
        } else {
            textNim.setText(mahasiswa.getNim());
            textNama.setText(mahasiswa.getNama());
            textAreaAlamat.setText(mahasiswa.getAlamat());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.Arayuz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tr.isparta.edu.Services.KitapTurService;
import tr.isparta.edu.Services.Mesajlar;

/**
 *
 * @author drhal
 */
public class KitapTur extends javax.swing.JFrame {

    /**
     * Creates new form KitapTur
     */
    public KitapTur() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSonuc = new javax.swing.JTable();
        jButtonEkle = new javax.swing.JButton();
        jButtonGuncelle = new javax.swing.JButton();
        jButtonSil = new javax.swing.JButton();
        jButtonListele = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kitap Tür");

        jLabel2.setText("Kitap Tür Adı");

        jTableSonuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Adi"
            }
        ));
        jTableSonuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSonucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSonuc);

        jButtonEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tr/isparta/edu/Images/ekle.png"))); // NOI18N
        jButtonEkle.setText("Ekle");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        jButtonGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tr/isparta/edu/Images/duzenle.png"))); // NOI18N
        jButtonGuncelle.setText("Güncelle");
        jButtonGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuncelleActionPerformed(evt);
            }
        });

        jButtonSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tr/isparta/edu/Images/sil.png"))); // NOI18N
        jButtonSil.setText("Sil");
        jButtonSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSilActionPerformed(evt);
            }
        });

        jButtonListele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tr/isparta/edu/Images/liste.png"))); // NOI18N
        jButtonListele.setText("Listele");
        jButtonListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListeleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAdi)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEkle)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonGuncelle)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jButtonListele))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEkle)
                    .addComponent(jButtonGuncelle)
                    .addComponent(jButtonListele)
                    .addComponent(jButtonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        // TODO add your handling code here:
        String adi=jTextFieldAdi.getText().trim();
        new KitapTurService().Ekleme(adi);
        
        
        //Listele();
        AzalanSekildeListele();
        Temizle();        
    }//GEN-LAST:event_jButtonEkleActionPerformed

    private void jButtonGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuncelleActionPerformed
        // TODO add your handling code here:
        String secilenID= jTextFieldID.getText().trim();
        
        if (secilenID!=null && secilenID.length()>0) {
            String adi=jTextFieldAdi.getText().trim();
           
            int ID=Integer.parseInt(secilenID);
            new KitapTurService().Guncelleme(ID, adi);
            
            Listele();
            Temizle();
        }else{
            JOptionPane.showMessageDialog(null, new Mesajlar().SatirSeciniz());
        }       
    }//GEN-LAST:event_jButtonGuncelleActionPerformed

    private void jButtonSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSilActionPerformed
        // TODO add your handling code here:
        String secilenID= jTextFieldID.getText().trim();
        if (secilenID!=null && secilenID.length()>0) {
            int ID=Integer.parseInt(secilenID);
            new KitapTurService().Silme(ID);
            
            Listele();
            Temizle();
            
        }else{
            JOptionPane.showMessageDialog(null, new Mesajlar().SatirSeciniz());
        }      
    }//GEN-LAST:event_jButtonSilActionPerformed

    private void jButtonListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListeleActionPerformed
        // TODO add your handling code here:
       Listele();
       Temizle();
    }//GEN-LAST:event_jButtonListeleActionPerformed

    private void jTableSonucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSonucMouseClicked
        // TODO add your handling code here:        
        DefaultTableModel model=(DefaultTableModel)jTableSonuc.getModel();
        int secilen=jTableSonuc.getSelectedRow();  
        if(secilen>0){
            jTextFieldID.setText(model.getValueAt(secilen, 0).toString());
            jTextFieldAdi.setText(model.getValueAt(secilen,1).toString());           
        }else{
            JOptionPane.showMessageDialog(null, new Mesajlar().SatirSeciniz());
        }
    }//GEN-LAST:event_jTableSonucMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTextFieldID.hide();
    }//GEN-LAST:event_formWindowOpened

    
    public void Listele(){
        DefaultTableModel model=(DefaultTableModel)jTableSonuc.getModel();
        model=new KitapTurService().Getir(model);
    }
    
    public void AzalanSekildeListele(){
        DefaultTableModel model=(DefaultTableModel)jTableSonuc.getModel();
        model=new KitapTurService().AzalanSekildeGetir(model);
    }
    
    public void Temizle(){
        jTextFieldID.setText("");
        jTextFieldAdi.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KitapTur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapTur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapTur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapTur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapTur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JButton jButtonGuncelle;
    private javax.swing.JButton jButtonListele;
    private javax.swing.JButton jButtonSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSonuc;
    private javax.swing.JTextField jTextFieldAdi;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}

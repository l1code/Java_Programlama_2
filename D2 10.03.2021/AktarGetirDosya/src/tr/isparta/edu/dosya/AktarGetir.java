/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.dosya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drhal
 */
public class AktarGetir extends javax.swing.JFrame {

    /**
     * Creates new form AktarGetir
     */
    public AktarGetir() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTGetir = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAktar = new javax.swing.JTable();
        jBAktar = new javax.swing.JButton();
        jBTemizle = new javax.swing.JButton();
        jBGetir = new javax.swing.JButton();
        jBFarkliGetir = new javax.swing.JButton();
        jBDizinSil = new javax.swing.JButton();
        jBDosyaSil = new javax.swing.JButton();
        jBDosyaDizinSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTGetir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTGetir);

        jTAktar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTAktar);

        jBAktar.setText("Aktar");
        jBAktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAktarActionPerformed(evt);
            }
        });

        jBTemizle.setText("Temizle");

        jBGetir.setText("Getir");
        jBGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGetirActionPerformed(evt);
            }
        });

        jBFarkliGetir.setText("Farkl?? Getir");
        jBFarkliGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFarkliGetirActionPerformed(evt);
            }
        });

        jBDizinSil.setText("Dizin Sil");

        jBDosyaSil.setText("Dosya Sil");

        jBDosyaDizinSil.setText("Dosya / Dizin Sil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBDizinSil)
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jBAktar)
                        .addGap(85, 85, 85)
                        .addComponent(jBTemizle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBDosyaSil)
                        .addGap(115, 115, 115)
                        .addComponent(jBDosyaDizinSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBGetir)
                        .addGap(121, 121, 121)))
                .addComponent(jBFarkliGetir)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAktar)
                    .addComponent(jBTemizle)
                    .addComponent(jBGetir)
                    .addComponent(jBFarkliGetir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDizinSil)
                    .addComponent(jBDosyaSil)
                    .addComponent(jBDosyaDizinSil))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGetirActionPerformed
        // TODO add your handling code here:
        
        /*
        Se??ili dosyalarda a??a????daki i??lemi uygula;
        ilk sat??r?? virg??l (,) ile ayr??lm???? s??t??n de??erlerini jTGetir ve jTAktar adl?? jTable 
        bile??enlerine virg??llerden ay??rarak aktar. 
        Geriye kalan sat??rlar?? ise / ayrac??n?? kullanarak par??ala ve jTGetir ve jTAktar
        jTable bile??enlerine doldur.        
        
        */
        JFileChooser sec=new JFileChooser();
        sec.showOpenDialog(null);
        
        File f=sec.getSelectedFile();
        String dosyaAdi=f.getAbsolutePath();
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(f));
            String ilkSatir=br.readLine().trim();
            String[] sutunlar=ilkSatir.split(",");
            DefaultTableModel model=(DefaultTableModel)jTGetir.getModel();
            model.setColumnIdentifiers(sutunlar);
            
            DefaultTableModel modelAktar=(DefaultTableModel)jTAktar.getModel();
            modelAktar.setColumnIdentifiers(sutunlar);
            
            Object[] tabloSutunlari=br.lines().toArray();
            
            for (int i = 0; i < tabloSutunlari.length; i++) {
                String satir=tabloSutunlari[i].toString().trim();
                String[] veriSatir=satir.split("/");
                model.addRow(veriSatir);
                
                modelAktar.addRow(veriSatir);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGetirActionPerformed

    private void jBAktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAktarActionPerformed
        // TODO add your handling code here:
        
        /*
        Kullan??c??n?? se??ti??i bir dosyaya jTAktar adl?? jTable i??erisindeki verileri 
        aktarmak istiyoruz.         
        */
        
        JFileChooser sec=new JFileChooser();
        sec.showOpenDialog(null);
        
        File f=sec.getSelectedFile();
        String dosyaAdi=f.getAbsolutePath();
        
        try {
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw);
            
            for (int i = 0; i < jTAktar.getRowCount(); i++) {
                for (int j = 0; j < jTAktar.getColumnCount(); j++) {
                    String gecici=jTAktar.getValueAt(i,j).toString().trim();
                    bw.write(gecici+" ");
                }
                bw.newLine(); // \n               
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAktarActionPerformed

    private void jBFarkliGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFarkliGetirActionPerformed
        // TODO add your handling code here:
        
        JFileChooser sec=new JFileChooser();
        sec.showOpenDialog(null);
        
        File f=sec.getSelectedFile();
        String dosyaAdi=f.getAbsolutePath();
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(f));
            DefaultTableModel model=(DefaultTableModel)jTGetir.getModel();
            
            //Vector v=(Vector) ((Vector)model.getDataVector().elementAt(1)).elementAt(2);
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
            Object[] tabloSutunlari=br.lines().toArray();
            
            for (int i = 0; i < tabloSutunlari.length; i++) {
                String satir=tabloSutunlari[i].toString().trim();
                String[] veriSatir=satir.split(" ");
                model.addRow(veriSatir);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBFarkliGetirActionPerformed

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
            java.util.logging.Logger.getLogger(AktarGetir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AktarGetir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AktarGetir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AktarGetir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AktarGetir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAktar;
    private javax.swing.JButton jBDizinSil;
    private javax.swing.JButton jBDosyaDizinSil;
    private javax.swing.JButton jBDosyaSil;
    private javax.swing.JButton jBFarkliGetir;
    private javax.swing.JButton jBGetir;
    private javax.swing.JButton jBTemizle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAktar;
    private javax.swing.JTable jTGetir;
    // End of variables declaration//GEN-END:variables
}

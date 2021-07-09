/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isparta.dosya;

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
import javax.swing.JOptionPane;
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
        jBTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTemizleActionPerformed(evt);
            }
        });

        jBGetir.setText("Getir");
        jBGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGetirActionPerformed(evt);
            }
        });

        jBFarkliGetir.setText("Farklı Getir");
        jBFarkliGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFarkliGetirActionPerformed(evt);
            }
        });

        jBDizinSil.setText("Dizin Sil");
        jBDizinSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDizinSilActionPerformed(evt);
            }
        });

        jBDosyaSil.setText("Dosya Sil");
        jBDosyaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDosyaSilActionPerformed(evt);
            }
        });

        jBDosyaDizinSil.setText("Dosya / Dizin Sil");
        jBDosyaDizinSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDosyaDizinSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jBAktar)
                        .addGap(103, 103, 103)
                        .addComponent(jBTemizle)
                        .addGap(119, 119, 119)
                        .addComponent(jBGetir)
                        .addGap(96, 96, 96)
                        .addComponent(jBFarkliGetir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jBDizinSil)
                                .addGap(108, 108, 108)
                                .addComponent(jBDosyaSil)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jBDosyaDizinSil)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAktar)
                    .addComponent(jBTemizle)
                    .addComponent(jBGetir)
                    .addComponent(jBFarkliGetir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDizinSil)
                    .addComponent(jBDosyaSil)
                    .addComponent(jBDosyaDizinSil))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGetirActionPerformed
        // TODO add your handling code here:
         /*
        Seçili dosyalarda aşağıdaki işlemi uygula;
        ilk satırı virgül (,) ile ayrılmış sütün değerlerini jTGetir ve jTAktar adlı jTable 
        bileşenlerine virgüllerden ayırarak aktar. 
        Geriye kalan satırları ise / ayracını kullanarak parçala ve jTGetir ve jTAktar
        jTable bileşenlerine doldur.        
        
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
        Kullanıcını seçtiği bir dosyaya jTAktar adlı jTable içerisindeki verileri 
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
            
            String ilkSatir=br.readLine().trim();
            String[] sutunlar=ilkSatir.split(",");
            
            DefaultTableModel model=(DefaultTableModel)jTGetir.getModel();
            model.setColumnIdentifiers(sutunlar);
            
          
            
            Object[] tabloSutunlari=br.lines().toArray();
            
            for (int i = 0; i < tabloSutunlari.length; i++) {
                String satir=tabloSutunlari[i].toString().trim();
                String[] veriSatir=satir.split("/");
                model.addRow(veriSatir);
            }
            
            Vector v=model.getDataVector();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AktarGetir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBFarkliGetirActionPerformed

    private void jBTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTemizleActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel modelAktar=(DefaultTableModel) jTAktar.getModel();
        DefaultTableModel modelGetir=(DefaultTableModel) jTGetir.getModel();
        
        modelAktar.getDataVector().removeAllElements();
        modelGetir.getDataVector().removeAllElements();
        
        modelAktar.fireTableDataChanged();
        modelGetir.fireTableDataChanged();
        
    }//GEN-LAST:event_jBTemizleActionPerformed

    private void jBDosyaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDosyaSilActionPerformed
        // TODO add your handling code here:
        
        JFileChooser sec=new JFileChooser();
        sec.showOpenDialog(null);
        
        File f=sec.getSelectedFile();
        DosyaSil(f);
    }//GEN-LAST:event_jBDosyaSilActionPerformed

    private void jBDizinSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDizinSilActionPerformed
        // TODO add your handling code here:
        File f=null;
        JFileChooser sec=new JFileChooser();
        sec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(sec.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            f=sec.getSelectedFile();
            DizinSil(f);
        }        
        
    }//GEN-LAST:event_jBDizinSilActionPerformed

    private void jBDosyaDizinSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDosyaDizinSilActionPerformed
        // TODO add your handling code here:
        
        JFileChooser sec=new JFileChooser();
        sec.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        if(sec.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            File f=sec.getSelectedFile();
            if(f.isDirectory()){
                 // dizin demek anlamına geliyor. 
                //JOptionPane.showMessageDialog(null, "Seçili Dosya Dizindir","Seçim tipi",JOptionPane.PLAIN_MESSAGE);
                DizinSil(f);
            }else{
                 //dizin değil demek anlamına geliyor. 
                //normal bir dosya demek
                //JOptionPane.showMessageDialog(null, "Seçili olan dizin değildir. ","Seçim tipi",JOptionPane.PLAIN_MESSAGE);
                DosyaSil(f);
            }
        }
    }//GEN-LAST:event_jBDosyaDizinSilActionPerformed

    
    public void DizinSil(File dizin){
        File[] dosyalar=dizin.listFiles();
        int dosyalarSayisi=dosyalar.length;
        int sayac=0;
        int silinmeIndex=0;
        File[] silinmeyenler=null;
        
        for (File dosya : dosyalar) {            
            if(dosya.delete()){
                sayac++;
            }else{
                silinmeyenler[silinmeIndex]=dosya;
                silinmeIndex++;
                JOptionPane.showMessageDialog(null, dosya.getName()+ " adlı Dosya Silinemedi","Silme",JOptionPane.PLAIN_MESSAGE);
            }           
        }
        
        if(sayac==dosyalarSayisi){
            JOptionPane.showMessageDialog(null,"Tüm Dosyalar Silindi","Silme Sonucu",JOptionPane.PLAIN_MESSAGE);
        }else{
            for (File dosya : silinmeyenler) {
                JOptionPane.showMessageDialog(null,dosya.getName()+ "adlı dosya silinmedi","Silme",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    public void DosyaSil(File file){
        //dosya silindi ise mesajı göster
        if(file.delete()){
            JOptionPane.showMessageDialog(null,"Dosya Silindi","Silme",JOptionPane.PLAIN_MESSAGE);
        }        
        //eğer silinmedi ise herhangi bir mesaj verme        
        //vermek isterse        
        else{
            JOptionPane.showMessageDialog(null,"Dosya Slinemedi","Dosya Silinmedi",JOptionPane.PLAIN_MESSAGE);
        }
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
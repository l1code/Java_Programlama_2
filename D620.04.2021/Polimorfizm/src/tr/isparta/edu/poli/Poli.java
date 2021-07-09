/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.poli;

/**
 *
 * @author drhal
 */
public class Poli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asker asker=new Asker();
        Asker er=new Er();
        Asker yzbasi=new Yuzbasi();
        
        Hayvan timsah=new Timsah();
        
        Calisan programciCalisan=new Programci();
        Calisan mudurCalisan=new Mudur();
        Calisan pazarlamaciCalisan=new Pazarlamaci();
        
        
        Mudur m=new Mudur();
        m.isYap(9);
        
        Insan[] insanlar=
        {new Turk("Ahmet"),new Ingiliz("Marti"),new Alman("Hans")};
        
        /*Insan insan1=new Turk("Ahmet");
        Insan insan2=new Ingiliz("Marti");
        Insan insan3=new Alman("Hans");*/
        
        
        for (Insan insan : insanlar) {
            System.out.println(insan.getAd()+":"+insan.merhaba());
        }
    }
    
}

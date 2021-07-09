/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isparta.nesnetabanli;

/**
 *
 * @author drhal
 */
public class Polimorfizm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnaSinif a=new AnaSinif();
        a.yaz();
        
        Tureyen1 tureyen1=new Tureyen1();
        Tureyen2 tureyen2=new Tureyen2();
        Tureyen3 tureyen3=new Tureyen3();
        tureyen1.yaz();
        tureyen2.yaz();
        tureyen3.yaz();
        
        Hayvan timsah=new Timsah();
        
        Asker asker=new Asker();
        Asker er=new Er();
        Asker yuzbasi=new Yuzbasi();
        
        Sekreter sekreter1=new Sekreter();
        Sekreter sekreter2=new Sekreter(9000);
        Sekreter sekreter3=new Sekreter(2000,"Müdür Sekreter");
        Sekreter sekreter4=new Sekreter(10000,"Rektör sekreteri");
        
        
        Mudur m=new Mudur();
        m.isYap(10);
        
        Calisan programciCalisan=new Programci();
        Calisan mudurCalisan=new Mudur();
        Calisan pazarlamaciCalisan=new Pazarlamaci();
        
        
    }
    
}

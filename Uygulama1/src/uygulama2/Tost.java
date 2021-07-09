/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama2;

/**
 *
 * @author drhal
 */
public class Tost {

    int sayi;
    String malzeme;
    
    
    public Tost(){
        this(5);
        System.out.println("Parametresiz yapılandırıcı");        
    }
    
    public Tost(int sayi){
        this(sayi,"Sucuklu");
        this.sayi=sayi;        
        System.out.println("Tost(int sayi)");        
    }
    
    public Tost(int sayi, String malzeme){
        this.sayi=sayi;
        this.malzeme=malzeme;
        System.out.println("Tost(int sayi, String malzeme)");
    }
    
    public void SiparisGoster(){
        System.out.println("Tost Sayısı:"+sayi+" malzeme:"+malzeme);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tost tost=new Tost();        
        tost.SiparisGoster();
    }
    
}

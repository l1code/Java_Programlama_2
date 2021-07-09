/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.repeat;

/**
 *
 * @author drhal
 */
public class Tost {
    int sayi;
    String malzeme;

    public Tost() {
        this(5);
        System.out.println("Parametresiz yapılandırıcı");  
    }

    public Tost(int sayi) {
        this.sayi = sayi;
        this.malzeme="sucuklu";
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

class Kagit{
    public Kagit(int i){
        System.out.println("Kağıt ("+i+")");
    }  
}
class Defter{
   Kagit k1=new Kagit(1);    
    
    public Defter(){
        System.out.println("defter yapılandırıcısı");
        k2=new Kagit(33);
    } 
    
    Kagit k2=new Kagit(2);
    
    public void islemTamam(){
        System.out.println("İşlem tamam");
    }
    
    Kagit k3=new Kagit(3);
    
    public static void main(String[] args){
      Defter d=new Defter();
      d.islemTamam();
    } 
}

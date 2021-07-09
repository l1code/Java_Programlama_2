/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.sinif;

/**
 *
 * @author drhal
 */
public class kedi {
    /**
     * Kalıtım konusu nesneye yönelik programlamanın (object oriented programming) en önemli
kavramlarından bir tanesidir. Kalıtım kavramı, kısaca bir sınıftan diğer bir sınıfın türemesidir. Yeni
türeyen sınıf, türetilen sınıfın global alanlarına ve yordamlarına (statik veya değil) 
* otomatik olarak sahip
olur (private olanlar hariç). ()
Unutulmaması gereken unsur, yeni türeyen sınıf, türetilen sınıfın private global alanlarına ve
yordamlarına (statik veya değil) otomatik olarak sahip olamaz. Ayrıca yeni türeyen sınıf eğer 
* türetilen sınıf
ile ayrı paketlerde ise yeni türeyen sınıf, türetilen sınıfın sadece public ve protected erişim
* belirleyicisine sahip olan global alanlarına (statik veya değil) ve yordamlarına (statik veya değil)
* otomatik
olarak sahip olur. 
     */
    
    private int gozSayisi=2;
    protected int ayakSayisi=4;
    
     public void yakalaAv(){
        System.out.println("kedi sinifi av yakaladı");
    }
     
    public int getGozSayisi() {
        return gozSayisi;
    }
      
    public void setGozSayisi(int gozSayisi) {
        this.gozSayisi = gozSayisi;
    }
    
    public static void main(String[] args){
        kedi kd=new kedi();
        kd.yakalaAv();
    }
}

class kaplan extends kedi{
    //her kaplan bir kedidir
    //her kedi bir kaplan değildir. 
    
     public static void main(String[] args){
        kaplan kp=new kaplan();
        kp.yakalaAv();
        kp.setGozSayisi(2);
        System.out.println("kaplan goz sayısı:"+kp.getGozSayisi());
        System.out.println("ayak sayisi="+kp.ayakSayisi);
     }
}
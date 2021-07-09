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
public class Meyve {
    public Meyve() {
        System.out.println("ben meyveyim");
    }    
}

class Elma{
     /*    
    Elma sınıfı, Meyve sınıfını doğrudan kendi içerisinde tanımlayarak, 
    Meyva sınıfının içerisindeki erişilebilir
    olan özellikleri kullanabilir.
    Kompozisyon yöntemi denilmektedir. 
    */     
    private Meyve m=new Meyve();
}

class Motor{
    private static int motorGucu=3600;
    public void calis(){
        System.out.println("motor calısıyor");
    }
     
    public void dur(){
        System.out.println("motor durdu");
    }
}

class AileArabasi{//pascal standardı
     /**
     * AileArabası sınıfının içerisine, Motor tipinde global bir alan yerleştirilerek,
     * bu iki sınıf birbirine bağlanmış oldu.
     * AileArabası sınıfının hereketEt() ve dur() metotlarında, önce Motor sınıfına ait yordamlar
     (methods) direk olarak çağrıldı.
     */
    
    private Motor m=new Motor();
    public void hareketEt(){ // camel case standardı
        m.calis();
        System.out.println("aile arabasi calıstı");
    }
    
    public void dur(){
        m.dur();
        System.out.println("aile arabası durdu");
    }
    
     public static void main(String[] args){
        AileArabasi aileArabasi=new AileArabasi();
        aileArabasi.hareketEt();
        aileArabasi.dur();
    }
}

class govde{
      void benzinTankKontrolEt(){
        System.out.println("benzin tankı kontrol edildi");
    }
}

class solBacak{
    void maviLazerSilahiAtesle(){
        System.out.println("mavi lazer ateşlendi");
    }
}

class sagBacak{
    void kirmiziLazerSilahiAtesle(){
        System.out.println("kırmızı lazer ateşlendi");   
    }
}


class sagKol{
 void hedeHodoKalkaniCalistir(){
        System.out.println("kalkan çalıştı");
    }
}

class solKol{
     void gucKaynagiKontrolEt(){
        System.out.println("guc kaynagi kontrol edildi");
    }
}

class kafa{
    void tumBirimlereUyariGonder(){
        System.out.println("tum birimlere uyarı gonderildi");
    }
    void dusmanTanimlamaSistemiDevreyeSok(){
        System.out.println("dusman tanımlandı");
    }
}

class Voltran{
     govde gv=new govde();
     solBacak sb=new solBacak();
     sagBacak sgb=new sagBacak();
     sagKol sgk=new sagKol();
     solKol slk=new solKol();
     kafa kf=new kafa();
     
      //komposizyon örneğidir. 
    public static void main(String[] args){
        Voltran vr=new Voltran();
        vr.kf.dusmanTanimlamaSistemiDevreyeSok();
        vr.kf.tumBirimlereUyariGonder();
        vr.sgb.kirmiziLazerSilahiAtesle();
    }
}
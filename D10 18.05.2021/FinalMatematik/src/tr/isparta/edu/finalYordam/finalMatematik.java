/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.finalYordam;

/**
 *
 * @author drhal
 */
public class finalMatematik {
        static final double PI=3.14; //Program içerisinde değiştirilemez.
        
        double cevreHesapla(int r){
            int yaricap=r;
            double cevreDegeri=2*PI*yaricap;
            return cevreDegeri;
        }
        
        public static void main(String[] args){
            finalMatematik fm=new finalMatematik();
            double sonuc=fm.cevreHesapla(4);
            System.out.println(sonuc);
            
            
            SivilPolis sp=new SivilPolis();
            sp.sucluYakala();
            
            Polis p=new Polis();
            
        }
}

//final ve private erişim belirleyicisine sahip olan bir yordam, başka bir yordam tarafından iptal
// ediliyormuş gibi gözükebilir.
class Polis{
    public Polis() {
        sucluYakala();
    }
    
    private final void sucluYakala(){
        System.out.println("Polis.sucluYakala()");
    }
}


class SivilPolis extends Polis{
    public void sucluYakala(){//iptal etme sozkonusu değil, override işlemi gerçekleştirilmedi.
       //override özelliğini kullanıldımı , kısaca açıklayınız.???
       System.out.println("SivilPolis.sucluYakala()");
    }
}


//private erişim belirleyicisine sahip olan yordam dışarıdan erişilemeyeceğinden dolayı,
// türetilen sınıflar
//içerisindeki yordamlar tarafından iptal edilmesi söz konusu değildir
//private erişim belirleyicisine sahip
//olan bir yordam, bir sınıfın gizli ve özel tarafıdır, yani o sınıfın 
//dünyaya açılan bir penceresi değildir.
// Bir
//sınıfın dünyaya açılan pencereleri, o sınıfa ait public,
 // protected veya friendly erişim
//belirleyicilerine sahip olan yordamlarıdır. 


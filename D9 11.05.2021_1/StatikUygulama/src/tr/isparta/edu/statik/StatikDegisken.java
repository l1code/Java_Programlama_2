/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.statik;

/**
 *Sadece global olan alanlara statik özelliği verilebilir. Yerel değişkenlerin statik olma özellikleri yoktur.
Global alanları tür olarak iki çeşide ayırabiliriz: statik olan global alanlar ve nesnelere ait global alanlar.
Statik alanlar, bir sınıfa ait olan alanlardır ve bu sınıfa ait tüm nesneler için ortak bir bellek alanında
bulunurlar, ayrıca statik alanlara sadece bir kez ilk değerleri atanır.
 * @author drhal
 */
public class StatikDegisken {
    public static int x;
    public int y;
    
     public static void ekranaBas(StatikDegisken sd){        
        System.out.println("Statikdegisken.x="+sd.x+", StatikDegisken.y="+sd.y);
    }
     
     public static void main(String[] args){
        StatikDegisken sd1=new StatikDegisken();
        StatikDegisken sd2=new StatikDegisken();
        
        
        x=10;
        System.out.println("x="+x);
        System.out.println("sd1.x="+sd1.x);
        System.out.println("sd2.x="+sd2.x); 
        
         System.out.println("___________________");
         
         sd1.x=13;
         sd1.y=90;
         sd2.y=87;
         
         System.out.println("x="+x);
         System.out.println("sd1.x="+sd1.x);
         System.out.println("sd2.x="+sd2.x);
         System.out.println("sd1.y="+sd1.y);
         System.out.println("sd2.y="+sd2.y);
         
         System.out.println("_________________________________");
         
         
        sd2.x=14;
        sd2.y=100;
        System.out.println("x="+x);
        System.out.println("sd1.x="+sd1.x);
        System.out.println("sd2.x="+sd2.x);
        System.out.println("sd1.y="+sd1.y);
        System.out.println("sd2.y="+sd2.y);
        
        sd1.y=0;
        sd2.y=90;
                 
     }
    
}

/*

Statik yordamlar (sınıf yordamları) nesnelerden bağımsız yordamlardır. Statik bir yordamı çağırmak için
herhangi bir nesne oluşturulmak zorunda değildir. Statik olmayan yordamlardan (nesneye ait yordamlar)
statik yordamları rahatlıkla çağırabilmesine karşın, statik yordamlardan nesne yordamlarını doğrudan
çağrılamaz.

*/

class StatikTest{
    public static void hesapla(int a, int b){
        new StatikTest().islemYap(a, b);
        //islemYap(a,b);
        /* static yordam doğrudan nesneye ait bir yordamı çağıramaz */
    }
    
    public void islemYap(int a, int b){
        hesapla(a,b);
    }
}



/*

Bu örneğimizde görüldüğü üzere topla() yordamının amacı sadece kendisine gelen iki double
değerini toplamak ve sonucu geri döndürmektir. topla() yordamı Toplama sınıfına ait bu nesnenin
durumu ile ilgili herhangi bir görev üstlenmediği için statik yordam (sınıf yordamı) olarak tanımlanması
gayet mantıklıdır. Ayrıca topla() yordamını çağırmak için Toplama sınıfına ait bir nesne oluşturmak da
çok gereksiz durmaktadır. Şimdi Toplama sınıfı içerisindeki statik olan topla() yordamını kullanan bir
uygulama yazalım.


*/

class Toplama{
    public static double topla(double a, double b){
        double sonuc=a+b;
        return sonuc;
    }
}

/*
ToplamaIslemi sınıfı, kullanıcıdan aldığı parametreleri öncelikle
double tipine dönüştürmektedir. Daha sonra bu değerleri Toplama
sınıfının topla() yordamına göndererek, toplatmaktadır. Dikkat
edileceği üzere topla() yordamını çağırmak için Toplama sınıfına ait
bir nesne oluşturma zahmetinde bulunmadık. Yukarıdaki uygulamamızı
aşağıdaki gibi çalıştıracak olursak,
*/

class ToplamaIslemi{
    public static void main(String[] args){
        double a=Double.parseDouble("10.5");
        double b=Double.parseDouble("10.4");
        
        double sonuc=Toplama.topla(a, b);
        System.out.println("Sonuc:"+sonuc);
    }
}
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
public class Sarmalayici {
    
    public int degisken1=10;
    public int degisken4=30;
    public double degisken2=34.56;
    public boolean degisken3=false;
    public String aciklama=new String("açıklama");
    
    public static void main(String[] args) {
        char c='x';        
        Character ch=new Character(c);
        
        int b=10;        
        Integer kk=new Integer(b);        
        System.out.println(ch.charValue());
        
        Sarmalayici sar=new Sarmalayici();
        sar.Gecerlilik(101);
        
        sar.degisken1=50;
        sar.degisken4=20;
        sar.degisken2=21.999;
        sar.degisken3=true;
        sar.aciklama="java programlama 2";
        
        
        sar.degisken1=sar.degisken4;
        
//        Araba araba=new Araba();
        Araba araba1=new Araba(2);
        Araba araba2=new Araba(4,5);
        
        GunHesaplama gun=new GunHesaplama();
        gun.GunEkle(2);
        gun.GunEkle(3);;
        gun.GunuEkranaBas();
        
        
        for (int i = 0; i < 10; i++) {
            new CayFincani();
        }
        
    }
    
    public void Gecerlilik(int kontrol){
        int a=10;
        
        {
            int b=90;
            
            System.out.println(a);
            System.out.println(b);
            
        }
        
        
        if(kontrol>100){
            Sarmalayici sar=new Sarmalayici();
            sar.Gecerlilik1();
        }else{
            
        }
        
        
    }
    
    public void Gecerlilik1(){
        for (int i = 0; i < 10; i++) {
            new KahveFincani();
            
            if(i%5==0){
                new KahveFincani(true,i);
            }else{
                new KahveFincani(false,i);
            }
        }
    }
    
    public class KahveFincani{
        public KahveFincani(){ //yapıcı metot
            System.out.println("Kahve Fincanı");
        }
        
        public KahveFincani(boolean sutlu){
            if(sutlu==true){
                System.out.println("Sütlü Kahve");
            }else{
                System.out.println("Normal Kahve");
            }
        }
        
        public KahveFincani(boolean sutlu, int indeks){
            if(sutlu==true)
                System.out.println(indeks+" - Sütlü Kahve");
            else
                System.out.println(indeks+" - Normal Kahve");
            
        }       
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.nesne;

/**
 *
 * @author drhal
 */
public class Tekrar {
    public static void main(String[] args) {
        OrnekSinif a=new OrnekSinif();
        a.toplamaYap(4.4, 5);
        a.toplamaYap(3,3.3);
        a.toplamaYap(4, 4);   
        
        System.out.println("ikinci uygulama");
        
        StatikUygulama c1=new StatikUygulama();
        System.out.println("yaricap:"+c1.yCap+" , nesne say:"+c1.nesnesay);
        StatikUygulama c2=new StatikUygulama(5);
        System.out.println("yaricap:"+c2.yCap+", nesne say:"+c2.nesnesay);
        
        //c1=new StatikUygulama();
        c1.yCap=9;
        c1.nesnesay=70;
        //c1.nesnesay+=70;
        
        System.out.println("yaricap:"+c1.yCap+", nesne say:"+c1.nesnesay);
        System.out.println("yaricap:"+c2.yCap+", nesne say:"+c2.nesnesay);
        
        System.out.println("sınıf adı ile nesneye erişim: (ycap)"+StatikUygulama.nesnesay);
        
        System.out.println("3. uygulama");
        Cember cbir=new Cember();
        Cember ciki=new Cember(3);
        System.out.println("c1 yaricap:"+cbir.yaricap+", c1 alan:"+cbir.alanHesapla());
        System.out.println("c2 yaricap:"+ciki.yaricap+", c2 alan:"+ciki.alanHesapla());  
    }
}

class Cember{
    static double yaricap;

    public Cember() {
        this.yaricap=90;
    }
    
    public Cember(double yaricap) {
        this.yaricap += yaricap;
    }
    
    
    double alanHesapla(){
        return yaricap*yaricap*Math.PI;
    }
}

class StatikUygulama{
    double yCap;
    static int nesnesay=0;

    public StatikUygulama() {
        yCap=1.0;
        nesnesay++;
    }

    public StatikUygulama(double yCap) {
        this.yCap = yCap;
        nesnesay++;
    }
    
    
    public StatikUygulama(double yCap, int nesnesay) {
        this.yCap = yCap;
        nesnesay++;
    }
       
       static int nesnesayisial(){
           return nesnesay;
       }
       
       double alan(){
           return yCap*yCap*Math.PI;
       }
}

class OrnekSinif{
    public int toplamaYap(int a, int b){
        int sonuc=a+b;
        System.out.println("int a, int b:"+sonuc);;
        return sonuc;
    }
    
    public void toplamaYap(int a, double b){
        double sonuc=a+b;
        System.out.println("int a, double b:"+sonuc);
        
    }
    
    public double toplamaYap(double a, int b){
        double sonuc=a+b;
        System.out.println("double a, int b:"+sonuc);
        return sonuc;
    }
}

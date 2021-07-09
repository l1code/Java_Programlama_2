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
public class Kisi {
    private String isim;
    public Kisi(String isim){
        this.isim=isim;
    }
    
    public String getIsim(){
        return isim;
    }
    
    public String setIsim(String isim){
        this.isim=isim;
        return this.isim;
    }
}

//kisi calisanın hem maasi, hem ismi var. 
//çözüm üst sınıfın yapılandırıcısına erişmek. super , this ifadesini karıştırmayın. 
class KisiCalisan extends Kisi{
    
    private int maas;
    public KisiCalisan(String isim){
        super(isim);
    }
    public KisiCalisan(String isim, int maas) {
        super(isim);
        this.maas=maas;
    }
    
    public int getMaas(){
        return maas;
    }
    
    public int setMaas(int maas){
        this.maas=maas;
        return this.maas;
    }    
}




//Yoneticinin hem bonus, hem isim, hem de maası var 
class Yonetici extends KisiCalisan{
    private int bonus;
    public Yonetici(String isim, int maas){
        super(isim, maas);
    }
    
    public void setBonus(int bonus){
        this.bonus=bonus;
    }
    
    public int getBonus(){
        return this.bonus;
    }
    
    @Override
    public int getMaas(){
        return super.getMaas()+this.bonus;
    }
}

//1 şirket içerisinde 1000 lerce çalışan olabilir. 
class Sirket{    
    private KisiCalisan[] calisanlar;
    public Sirket(){
        calisanlar=new KisiCalisan[3];
        Yonetici mudur=new Yonetici("Ahmet Kabul",10000);
        mudur.setBonus(1500);
        
        calisanlar[0]=mudur;
        calisanlar[1]=new KisiCalisan("Ahmet Yanmaz",7400);
        calisanlar[2]=new KisiCalisan("Veli Kaçmaz",4900);
    }
    
    public void calisanlariGoster(){
        for (KisiCalisan kisiCalisan : calisanlar) {
            if(kisiCalisan!=null)
                System.out.println(kisiCalisan.getIsim()+" "+kisiCalisan.getMaas());
        }
    }
    
    public static void main(String[] args){
        Sirket sirket=new Sirket();
        sirket.calisanlariGoster();
    }
}
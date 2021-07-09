/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isparta.finalcevaplar;

/**
 *
 * @author Ali Baran
 */
abstract  class Yiyecek {
    private String isim;
    private String renk;
    private String yer;
    
    public Yiyecek(String isim,String renk,String yer){
        this.isim=isim;
        this.renk=renk;
        this.yer=yer;
    }
    
    
    public String getisim(){
    return isim;
    }
    
    
    public void setisim(String isim){
        this.isim=isim;
    }
    
     public String getRenk(){
    return renk;
    }
     
     public void setRenk(String renk){
        this.renk=renk;
    }
     
      public String getYer(){
    return yer;
    }
     
     public void setYer(String yer){
        this.yer=yer;
    }
     
     
   public  void YiyecekTuru() {
        System.out.println("belirsiz");

    }  
   
   public class Sebze extends Yiyecek {
    
    public Sebze(String isim, String renk, String yer) {
        super(isim, renk, yer="toprak");
    }
    
    @Override
     public  void YiyecekTuru() {
        System.out.println("Sebze");

    }  
    
}

    public class Meyve extends Yiyecek {
    
    public Meyve(String isim, String renk, String yer) {
        super(isim, renk, yer="agac");
    }
    
    @Override
     public  void YiyecekTuru() {
        System.out.println("Meyve");

    }  
}

   
}



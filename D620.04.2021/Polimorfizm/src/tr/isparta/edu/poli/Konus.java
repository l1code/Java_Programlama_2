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
public interface Konus {
    String getAd();    
    String merhaba();
}
abstract class Insan implements Konus{
    private final String ad;
    protected Insan(String pAd){
        this.ad=pAd;
    }
     @Override
    public String getAd(){
        return this.ad;
    }    
}

class Turk extends Insan{
    public Turk(String pAd){
        super(pAd);
    }
    
    @Override
    public String merhaba(){
        return "merhaba";
    }
}

class Ingiliz extends Insan{
    public Ingiliz(String pAd){
        super(pAd);
    }
    
    
    @Override
    public String merhaba(){
        return "Hello!";
    }    
}

class Alman extends Insan{
    public Alman(String pAd){
        super(pAd);
    }
    
    
    @Override
    public String merhaba(){
        return "Hallo!";
    }    
}


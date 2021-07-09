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
public class Calisan {
    public String pozisyon;
    public void calis(){
        System.out.println("calis");
    }
    
    public void isYap(double a){
        System.out.println("Calisan.isYap()");
    }
}


class Mudur extends Calisan{
    public Mudur(){
        System.out.println("ben mudurum");
    }
    
    @Override
    public void calis(){
         System.out.println("mudur calis");
    }
    
    public void isYap(int a){
        System.out.println("Mudur.isyap");
    }
}


class Programci extends Calisan{
    public Programci(){
        System.out.println("ben programcıyım");
    }
    
    @Override
    public void calis(){
        System.out.println("Programci calis");
    }
}


class Pazarlamaci extends Calisan{
    public Pazarlamaci(){
        System.out.println("ben pazarlamacıyım");
    }
    
    @Override
    public void calis(){
        System.out.println("Pazarlamaci calis");
    }
}


class Sekreter extends Calisan{
    public Sekreter(){
        
    }
    
    @Override
    public void calis(){
        System.out.println("Sekreter calisiyor");
    }
}

class GenelMudur extends Mudur{
    public GenelMudur(){
        System.out.println("Genel Mudur");
    }
    
    @Override
    public void calis(){
        
    }
    
    public void toplantiYonet(){
        
    }
}

class AnalizProgramci extends Programci{
    public AnalizProgramci(){
        System.out.println("Analiz Programci");
    }
    public void analizYap(){
        
    }
}

class SistemProgramci extends Programci{
    public SistemProgramci(){
        System.out.println("Sistem programci");
    }
    
    public void sistemIncele(){
        
    }
}
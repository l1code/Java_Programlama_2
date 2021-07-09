/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isparta.nesnetabanli;

/**
 *
 * @author drhal
 */
public class Calisan {
    
    public String pozisyon;
    public void calis(){
        System.out.println("calis");
    }
    
    public void isYap(double saat){
        System.out.println("Calisan.isYap(),"+saat+" belirtilen süre kadar çalışmanı istiyorum.");
    }    
}

class Mudur extends Calisan{

    public Mudur() {
        System.out.println("ben mudurum");
    }

    @Override
    public void isYap(double saat) {
        System.out.println("Mudur.isyap");
    }

    @Override
    public void calis() {
        System.out.println("mudur calis");
    }
}

class Programci extends Calisan{

    public Programci() {
    }

    @Override
    public void calis() {
        System.out.println("programcı calis");
    }   
}

class Pazarlamaci extends Calisan{

    public Pazarlamaci() {
    }

    @Override
    public void isYap(double saat) {
        System.out.println("pazarlamaci isYap");
    }

    @Override
    public void calis() {
        System.out.println("pazarlamaci calis");
    } 
}


class Sekreter extends Calisan{

    public Sekreter() {
        //parametresiz yapıcı metot
        System.out.println("sekreter sınıfındaki parametresiz yapıcı metot içerisindeyim ");
    }
    
    public Sekreter(double maas){
        //tek parametreli yapıcı metot
        System.out.println("sekreter sınıfındaki maaş parametreli yapıcı metot içerisindeyim");
        System.out.println("Maaş:"+maas);
    }
    
    public Sekreter(double maas, String unvan){
        //iki parametreli 
        System.out.println("sekreter sınıfındaki maaş ve ünvan parametreli yapıcı metot içerisindeyim");
        System.out.println("Maaş:"+maas+", Ünvan:"+unvan);
    }
    
    public Sekreter(int maas){
        
    }
    
    @Override
    public void calis() {
        System.out.println("sekreter çalışıyor");
    }    
}


class GenelMudur extends Mudur{

    //müdür bir çalışandır
    //her müdür bir çalışandır
    //her çalışan müdür müdür
    
    //her genel müdür bir müdür
    //her müdür bir genel müdür değildir. 
    public GenelMudur() {
    }

    @Override
    public void calis() {
        super.calis(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void toplantiYonet(){
        
    }  
}

class AnalizProgramci extends Programci{

    public AnalizProgramci() {
    }
    
    public void analizYap(){
        
    }
}

class SistemProgramci extends Programci{

    public SistemProgramci() {
    }
    public void sistemIncele(){
        
    }
}


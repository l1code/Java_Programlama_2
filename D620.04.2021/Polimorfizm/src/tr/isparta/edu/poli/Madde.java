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
public interface Madde {
    public double yogunluk();
    public double hacim();
    public double kutle();
}

class kup implements Madde{

    public double yogunlukDeger=1;
    public double kenarDeger=1;
    
    @Override
    public double yogunluk() {
        return yogunlukDeger;
    }

    @Override
    public double hacim() {
        return kenarDeger*kenarDeger*kenarDeger;
    }

    @Override
    public double kutle() {
        double hacim=hacim();
        return (hacim)*yogunlukDeger;
    }    
}

class kure implements Madde{

     public double yogunluk=1;
    public double yaricap=1;
    @Override
    public double yogunluk() {
        return yogunluk;
    }

    @Override
    public double hacim() {
        return 4/3*Math.PI*yaricap*yaricap*yaricap;
    }

    @Override
    public double kutle() {
        return yogunluk()*hacim();
    }
    
    
}

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
public class Yumurta {
    int yumurtaSayisi=10;
    
    Yumurta SepeteKoy(){
        yumurtaSayisi++;
        return this;
    }
    
    public void Goster(){
        System.out.println("Yumurta Sayisi: "+ yumurtaSayisi);
    }
    
    public static void main(String[] args){
        new Yumurta().SepeteKoy().SepeteKoy().SepeteKoy().SepeteKoy().Goster();
    }
}

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
public class GunHesaplama {
    int gun, ay, yil;
    
    public void GunEkle(int gun){
        this.gun+=gun;
    }
    
    public void GunuEkranaBas(){
        System.out.println("Gün: "+gun);
    }
}

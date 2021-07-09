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
public class final5 {
      public void metod1() {
         
        int a = 4;
        System.out.println("a'nin degeri: " + a);
        metod2(a);
        System.out.println("a'nin degeri: " + a);
    }
     
    public void metod2(final int b) {
        b = b*2;
    }
}

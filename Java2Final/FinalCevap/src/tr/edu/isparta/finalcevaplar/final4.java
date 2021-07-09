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
public class final4 {
    
      final void yaz() {
        System.out.println("Ana sinif final metodu");
    }
}
public class FinalSubClass extends final4{
    void yaz() {

        System.out.println("Alt sınıftaki final metodu");

    }
}

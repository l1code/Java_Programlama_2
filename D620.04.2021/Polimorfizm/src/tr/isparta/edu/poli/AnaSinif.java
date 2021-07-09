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
public class AnaSinif {
     public void Yaz(){
        System.out.println("Ana sınıf");
    }
}

class Tureyen1 extends AnaSinif{
    public void Yaz(){
        System.out.println("Tureyen 1");
    }
}

class Tureyen2 extends AnaSinif{
    public void Yaz(){
        System.out.println("Tureyen 2");
    }
}

class Tureyen3 extends AnaSinif{
    public void Yaz(){
        System.out.println("Tureyen 3");
    }
}

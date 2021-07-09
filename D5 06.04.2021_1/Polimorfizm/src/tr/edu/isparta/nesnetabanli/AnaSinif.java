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
public class AnaSinif {
   public void yaz(){
       System.out.println("ana sınıf");
   }
    
   
}

class Tureyen1 extends AnaSinif{
    
    public void yaz(){
        System.out.println("türeyen 1");
    }
    
}

class Tureyen2 extends AnaSinif{
    public void yaz(){
        System.out.println("türeyen 2");
    }
}

class Tureyen3 extends AnaSinif{
    public void yaz(){
        System.out.println("türeyen 3");
    }
}



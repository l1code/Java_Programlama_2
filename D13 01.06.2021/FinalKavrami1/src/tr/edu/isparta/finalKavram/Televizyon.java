/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isparta.finalKavram;

/**
 *
 * @author drhal
 */
public final class Televizyon {
     /*   
    Bir sınıfı final yaparak, bu sınıftan türetilme yapılmasını engellemiş oluruz.
    Bir sınıfın final
yapılmasının iki sebebi olabilir, birincisi tasarım, ikincisi ise verimlilik.
    final sınıflar komposizyon
yöntemi ile kullanabilirler. ()
    */
    
    public void kanalBul(){
        
    }
}

/*class LCDTelevizyon extends Televizyon{
    
}*/

class Ev{
    int odaSayisi=5;
    Televizyon tv=new Televizyon();
    public static void main(String[] args){
        Ev e=new Ev();
        e.tv.kanalBul();
    }
}


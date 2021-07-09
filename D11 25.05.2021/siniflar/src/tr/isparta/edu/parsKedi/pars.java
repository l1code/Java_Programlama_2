/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.parsKedi;

import tr.isparta.edu.sinif.kedi;



/**
 *
 * @author drhal
 */
public class pars extends kedi{
    //her pars bir kedidir.
    //her kedi bir pars değildir
    
    public static void main(String[] args){
      pars p=new pars();
      p.setGozSayisi(2);
      
      System.out.println("pars goz sayısı:"+p.getGozSayisi());
      System.out.println("ayak sayısı="+p.ayakSayisi);
     
    }    
}

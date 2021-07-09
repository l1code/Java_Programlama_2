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
public class Hayvan {
    public Hayvan(){
          System.out.println("Ben bir hayvanım");
    }
    public void avYakala(){
        System.out.println("Hayvan avını yakala");
    }
}


class Kartal extends Hayvan {
    @Override
    public void avYakala(){
        System.out.println("Kartalın yakalcagı avları");
    }
}

class Timsah extends Hayvan{
    @Override
    public void avYakala(){
        System.out.println("Timesahların yakalacagı avlar");
    }
}

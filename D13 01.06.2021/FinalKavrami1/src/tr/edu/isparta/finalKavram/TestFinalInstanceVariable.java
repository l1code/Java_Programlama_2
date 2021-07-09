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
public class TestFinalInstanceVariable {
    private int x; // class'ın alanı olarak tanımlandığında bu instance variable'dır.
    private int y = 5; // Değişkeni tanımladıktan sonra değeri atayabiliriz.
    private int z; // Değişkenin değerini constructor'da veya herhangi bir metotda içinde tanımlanabilir.
    
    private final int a = 10; // final keyword kullanıldığında,
    // değişkenin değeri ya direkt tanımlanmalı yada constructor'da atanmalıdır.
    
    private final int b;
     // Eğer değer atanmamış ve final bir alan varsa 
    // constructorların tümünde o alan parametre olarak geçilip değer atanmalıdır.

    public TestFinalInstanceVariable(int b) {
        this.b = b;
    }

    public TestFinalInstanceVariable(int z, int b) {
        this.z = z;
        this.b = b;
    }
    
    public static void main(String[] args){
        TestFinalInstanceVariable testFinalInstanceVariable=new TestFinalInstanceVariable(20,40);
        
        
        System.out.println("x ==> " + testFinalInstanceVariable.x);  
        
        // instance variable'a bir değer atanmadığında varsayılan değer ne ise o değer yazılır.
        // Örneğin: int ise 0 gibi.
        
        
        System.out.println("y ==> " + testFinalInstanceVariable.y);  
        // y nin değeri direkt 5 olarak verilmiş ve daha sonra değiştirilmemiştir.
        
        System.out.println("z ==> " + testFinalInstanceVariable.z);  
        // z nin değeri tanımlanma esnasında verilmemiştir. Constructor'da parametre olarak geçilmiştir.
        
        System.out.println("a ==> " + testFinalInstanceVariable.a);  // a'nın değeri tanımlanma esnasında verilmiştir.
        System.out.println("b ==> " + testFinalInstanceVariable.b);  // b'nin değeri tanımlanma esnasında verilmemiştir.
        
        //Constructor'da parametre olarak geçilmiştir.
        //Eğer Constructor'da da değer atanmasaydı hata alırdık.     
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;

/**
 *
 * @author tss
 */
public class Array {
    public static void main(String[] args) {
        // Dichiaro Array di interi
        int [] numeri;
        // Creazione di un array di 100 numeri
        numeri = new int [100];
        
        // Forma abbreviata 1 (dichiarazione e creazione)
        // Nell'array vengono inizializzati 100 elementi al valore di default 0
        int[] numeri1 = new int [100] ;
        
        // Altra forma abbreviata (2) per dichiarare ed inizializzare un array
        int[] numeri2 = {10,20,30,40};
        
        stampa(numeri2);
        
        System.out.println("-------------------");
        
        //Stampa array
        stampa(numeri);
        
        // Inserimento elementi
        for (int i = 0; i < 100; i++) {
            numeri[i]=i+1;
                             
        }
        
        System.out.println("-------------------");
        
        //Stampa array
        stampa(numeri);
        
    }
    
    // Function in java
    public static void stampa(int[] array){
        //Stampa array
        for (int i = 0; i < array.length; i++) {
            int elemento = array[i];
            System.out.println(String.format("array[%s] = %s", i, elemento));
                 
        }
    }
}

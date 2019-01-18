/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez05;

/**
 *
 * @author tss
 */
public class Lez05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeri = {15, 85, 4, 75, 65, 45, 53, 51, 17, 3, 75};

        stampa(numeri);
        System.out.println("-------------------");

        //esercizio 1
        System.out.println(String.format("Il numero massimo è %s ", max(numeri)));

        System.out.println("-------------------");
        //esercizio 3
        stampa(pari(numeri));
        
        System.out.println("-------------------");
        
        ordina(numeri);
        stampa(numeri);
    }

    public static void stampa(int[] array) {
        if (array == null) {
            return;
        }
        for (int numero : array) {
            System.out.println(numero);
        }
    }
    // trovare il massimo in un array di numeri

    public static int max(int[] array) {
        int numMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > numMax) {
                numMax = array[i];
            }
        }
        return numMax;
    }

    // estrarre i numeri pari
    public static int[] pari(int[] array) {
        int numPari = 0;

        // Provare fare dei sotto funzioni
        // Stabilisco quanti numeri pari ho
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numPari += 1;
            }
        }
        int[] arrPari = null;
        if (numPari > 0) {
            // posso creare l'array
            arrPari = new int[numPari];

            //indice per array dei pari
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrPari[j] = array[i];
                    j++;
                }
            }

        }
        return arrPari;
    }

    // ricerca di un numero
    public static boolean cerca(int[] array, int numero) {
        boolean trovato = false;
        
        // Provare usare il WHILE e non il FOR
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                trovato = true;
            }
        }
        return trovato;
    }
    
    // ricerca di un numero
    public static boolean cerca1(int[] array, int numero) {
        boolean trovato = false;

        for (int elemento : array) {
            if (numero == elemento) {
                trovato = true;
            }
        }
        return trovato;
    }
    

    // ordina
    public static void ordina(int[] array) {
        // algoritmo selection sort
        for (int i = 0; i < array.length-1; i++) {
            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]){
                    int appoggio=array[i];
                    array[i]=array[j];
                    array[j]=appoggio;
                }
            }
        }

    }
}

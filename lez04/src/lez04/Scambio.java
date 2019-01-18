/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Scambio {

    // Per creare il metodo main ctrl+spazio e poi scegliere
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // Inserisco il primo numero
        System.out.println("Inserisci il primo numero: ");
        // Dichiaro la variabile n1 e gli assegno il numero inserito
        int n1 = s.nextInt();

        // Inserisco il secondo numero
        System.out.println("Inserisci il secondo numero: ");
        // Dichiaro la variabile n2 e gli assegno il numero inserito
        int n2 = s.nextInt();
        
        // Dichiaro una variabile z che uso da appoggio e gli assegno il valore di n1
        int z = n1;

        // Con le due istruzioni successive assegno ad n1 il contenuto di n2 e a n2 il contenuto di z
        n1 = n2;
        n2 = z;

        // Stampo su video il risultato delle variabili        
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        
        System.out.println("");
        // Altro metodo per l'output
        System.out.println("N1 vale "+n1+", N2 vale "+n2);
        System.out.println("");
        // Altro metodo
        // E' un metodo per formattare una frase. Si mette la parola chiave "%s" nella frase, successivamente metto le variabili 
        // nell'ordine che voglio vengano sostituite
        System.out.println(String.format("N1 vale %s, N2 vale %s",n1,n2));

    }
}

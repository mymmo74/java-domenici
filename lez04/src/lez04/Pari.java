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
public class Pari {

    public static void main(String[] args) {
        // start

        Scanner s = new Scanner(System.in);

        // Inserisco il  numero
        System.out.println("Inserisci il numero: ");
        // Dichiaro la variabile n e gli assegno il numero inserito
        int n = s.nextInt();

        // L'operatore % mi restituisce il resto di una divisione intera
        int resto = n % 2;

        if (resto == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}

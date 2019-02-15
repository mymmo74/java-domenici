package lez10_esercizio_01;

import java.util.Scanner;


/**
 * Esercizio n.1 
 * dal sito:
 * http://www.edutecnica.it/informatica/oggettix/oggettix.htm
 */

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        // inserisco due numeri per il calcolo delle potenze
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci un numero per il calcolo della potenza 1: ");
        int n1 = s.nextInt();
        System.out.println("Inserisci un numero per il calcolo della potenza 2: ");
        int n2 = s.nextInt();
        
        // istanzio due oggetti passando al costruttore la potenza inserita
        Potenza x = new Potenza(n1);
        Potenza y = new Potenza(n2);
        
        // richiamo per ciascun oggetto il metodo per il calcolo e stampa a video della potenza
        x.pow();
        y.pow();
        
        // inserisco nuova base da sostituire all'oggetto x con il metodo cambiobase
        System.out.println("--------------------------------------");
        System.out.println("Inserisci una nuova base: ");
        int newBase = s.nextInt();
        x.cambiobase(newBase);
        
        // calcolo e stampo a video la potenza dell'oggetto x (con la nuova base impostata
        x.pow();
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_11;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String args[]) {
        String st = "000";
        Sim s = new Sim("123", 20, 5);
        s.ins("000", 3);
        s.ins("789", 5);
        System.out.println(s);
        System.out.println("totale chiamate in min:" + s.cal());
        s.ins("000", 7);
        s.ins("456", 4);
        System.out.println(s);
        System.out.println("chiamate verso:" + st + ":" + s.conta(st));
        s.ins("000", 7);
        s.ins("789", 4);
        System.out.println(s);
        System.out.println("chiamate verso:" + st + ":" + s.conta(st));
    }//fine main
}// fine classe 

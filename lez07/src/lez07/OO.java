/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez07;

/**
 *
 * @author tss
 */
public class OO {

    public static void main(String[] args) {
        // istanziamento della classe
        Giacca g = new Giacca();

        Giacca g1 = new Giacca();

        System.out.println(g.numeroTasche);
        System.out.println(g1.numeroTasche);

        System.out.println(g == g1);

        // i due statement seguenti sono equivalenti (vale solo per il tipo String)
        String s = new String("ciao");
        String msg = "ciao";

        String s1 = new String("ciao");

        System.out.println(s == s1);

        // Rispetto a sopra da TRUE e non FALSE
        String r = "ciao";
        String r1 = "ciao";
        System.out.println(s == s1);

        System.out.println(s.equals(s1));
        
        StringBuffer sb = new StringBuffer("ciao");
    }
    
}

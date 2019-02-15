/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_12;

/**
 *
 * @author tss
 */
public class L {

    String rip;
    int prz;

    L(String r, int p) {
        rip = r;
        prz = p;
    }

    public int getprz() {
        return prz;
    }

    public String toString() {
        String s = "\tvoce:" + rip + " costo:" + prz + "\n";
        return s;
    }
}//fine classe L 

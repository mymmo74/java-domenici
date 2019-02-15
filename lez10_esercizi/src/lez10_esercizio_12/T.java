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
public class T extends A {

    private int nruote;

    T(int jd, String m, int n) {
        super(jd, m);
        nruote = n;
    }

    public String toString() {
        String s = super.toString() + " num ruote:" + nruote;
        return s;
    }
}//fine classe T 

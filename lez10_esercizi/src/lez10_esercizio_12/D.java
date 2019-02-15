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
public class D extends A {

    private boolean ae;

    D(int jd, String m, boolean ele) {
        super(jd, m);
        ae = ele;
    }

    public String toString() {
        String s = super.toString() + " acc.el:" + ae;
        return s;
    }
}//fine classe D 

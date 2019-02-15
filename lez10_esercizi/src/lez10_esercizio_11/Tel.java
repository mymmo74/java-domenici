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
class Tel {

    private final String numero;
    private final int durata;

    Tel(String n, int d) {
        numero = n;
        durata = d;
    }

    public String getn() {
        return numero;
    }

    public int getd() {
        return durata;
    }
}//fine classe TEL

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
public class A {

    private final int id;
    private int tot;//totale costo riparazione 
    private final String marca;
    L lista[];

    A(int jd, String m) {//costruttore
        id = jd;
        tot = 0;
        marca = m;
        lista = new L[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new L("", 0);
        }
    }//fine costruttore

    public int getid() {
        return id;
    }

    public void setlista(String v, int p) {
        for (int j = 0; j < lista.length; j++) {
            if (lista[j].getprz() == 0) {
                lista[j] = new L(v, p);
                tot += p;//incremento il totale del costo della riparazione
                break;
            }
        }
    }//fine setlista 

    public String toString() {
        String s = "id:" + id + " marca:" + marca + " tot:" + tot;
        if (lista[0].getprz() != 0) {
            s += "\n";
        }
        for (int j = 0; j < lista.length; j++) {
            if (lista[j].getprz() != 0) {
                s += lista[j];
            }
        }
        return s;
    }
}//fine classe A 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_01;

/**
 *
 * @author tss
 */
public class Potenza {
    // attributo della classe, base
    private int base; 
    
    //metodo costruttore
    public Potenza(int base) {
        this.base = base;
    } 
    
    // metodo per calcolo e stampa della potenza
    public void pow() { 
        int pot=base*base;
        
        System.out.println("--------------------------------------");
        System.out.println(String.format("La potenza del numero %s calcolata è: %s ",base, pot));
    }

    public void cambiobase(int nuovaBase) {
        this.base = nuovaBase;
    }
}

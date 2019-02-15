/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_05;

/**
 *
 * @author tss
 */
public class T {

    // proprietà della classe
    // variabili di istanza
    private int ore;
    private int min;
    private int sec;

     // costruttore
    public T(int o, int m, int s) {
        // verifico i dati inseriti, nel caso siano errati li imposto fissi a mezzanotte
        if (isT(o, m, s)) {
            ore = o;
            min = m;
            sec = s;
        } else {
            System.out.println("Data errata, sarà impostata a 00:00:00");
            ore = 0;
            min = 0;
            sec = 0;
        }
    }
    
    /** costruttori in overload
     * i costruttori seguenti richiamano quello principale nella forma
     * this(par1,par2,par3)
     * SOLO per il costruttore in overload si usa solo la parola chiave THIS
     * invece per l'overload dei metodi ci si riferisce come this.nomeMetodo
     */
    public T() {
        this(0, 0, 0);
    }

    public T(int o) {
        this(o, 0, 0);
    }

    public T(int o, int m) {
        this(o, m, 0);
    }

    // metodo per verificare la validità dei dati inseriti
    // mi restituisce 
    public boolean isT(int o, int m, int s) {
        return (o >= 0 && o < 24 && m >= 0 && m < 60 && s >= 0 && s < 60);
    }

    // metodo per settare un nuovo orario
    public void setT(int o, int m, int s) {
        if (isT(o, m, s)) {
            ore = o;
            min = m;
            sec = s;
        } else {
            System.out.println("Errore");
        }
    }

    // metodo che aggiunge un orario all'orario dell'oggetto
    public void addT(T t) {

        // aggiungo i secondi e verifico non siano superiori a 60
        sec += t.getSec();
        if (sec > 59) {
            sec -= 60;
            min++;
        }

        // aggiungo i minuti e verifico non siano superiori a 60
        min += t.getMin();
        if (min > 59) {
            min -= 60;
            ore++;
        }
        
        // aggiungo le ore e verifico non siano superiori a 24
        ore += t.getOre();
        if (ore > 23) {
            ore-= 24;
        }
    }
    
    // metodo che sottrarre un orario all'orario dell'oggetto
    public void subT(T t) {
        
        if (this.sec < t.getSec()) {
            this.min--;
            if (this.min<0){
                this.min=59;
                this.ore=23;
            }
            this.sec += 60 - t.getSec();
        } else {
            this.sec = this.sec - t.getSec();
        }
        
        if (this.min < t.getMin()) {
            this.ore--;
            if (this.ore<0){
                this.ore=23;
            }
            this.min += 60 - t.getMin();
        } else {
            this.min -= t.getMin();
        }
        if (this.ore==0 && t.getOre()!=0) {
            this.ore=24;
        }
        this.ore = Math.abs(this.ore - t.getOre());
    }

    public int getOre() {
        return this.ore;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return this.sec;
    }

    public void setOre(int ore) {
        if (ore < 24) {
            this.ore = ore;
        } else {
            System.out.println("lez10_esercizio_5.T.setOre()");
        }
    }

    public void setMin(int min) {
        this.min = min;
    }

    // costruttore in overload
    public void setSec(int sec) {
        this.sec = sec;
    }

//    public String toString() {
//        return String.format("%s:%S:%S")
//    }

    public String toString() {
        return getOre() + ":" + getMin() + ":" + getSec();
    }
}//fine classe T 

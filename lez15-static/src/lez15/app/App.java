/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez15.app;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 *
 * @author tss
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta carta = new Carta(Carta.Seme.CUORI,10);
        System.out.println(Carta.getCount());
    }
    
    private static List<Carta> creaMazzo(){
        List<Carta> result=new ArrayList<>();
        EnumSet <Carta.Seme> semi = EnumSet.allOf(Carta.Seme.class);
        for(Carta.Seme seme:semi){
            for(int i=1; i<=13;i++){
                result.add(new Carta(seme,i));
            }
        }
        return 
    }
}

class Carta {
    
    // variabili/proprietà di istanza
    private Seme seme;
    private int valore;
    private String nome;
    
    // variabile statica o di classe (non legata all'istanza), c'è una sola copia
    private static int count=0;
    
    
    // mi creo un "tipo" mio
    public enum Seme{
        CUORI, QUADRI, FIORI, PICCHE
    }
    
    
    
    public Carta(Seme seme, int valore){
        this(seme,valore,"");
        count++;
    }

    public Carta(Seme seme, int valore, String nome) {
        this.seme = seme;
        this.valore = valore;
        this.nome = nome;
    }
    
    public static int getCount() {
        
        return count;
    }
    public void disegna(){
        System.out.println("carta x..x..");
    }
}
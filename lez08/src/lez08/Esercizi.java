/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez08;

/**
 *
 * @author tss
 */
public class Esercizi {

    public static void main(String[] args) {
//        int numVocali = contaVocali("saagjehdejh");
//        System.out.println(numVocali);
        
        boolean t=palindroma("abc");
    }

    /**
     * Torna il numero di vocali di una Stringa
     *
     * @param caratteri
     * @return
     */
    public static int contaVocali(String caratteri) {
        String vocali = "aeiou";
        
        caratteri= caratteri.toLowerCase();
        
        int contaVocali = 0;
        for (int i = 0; i < caratteri.length(); i++) {
            char lettera = caratteri.charAt(i);
            if (vocali.indexOf(lettera)!=-1){
                    contaVocali++;
            }
            //System.out.println(lettera);
        }
        return contaVocali;
    }

    /**
     * Torna vero se la frase è palindroma Es. otto
     *
     * @param caratteri
     * @return
     */
    public static boolean palindroma(String caratteri) {
        boolean isPalindroma = false;
        
//        StringBuilder amordnilap = new StringBuilder("");
        String amordnilap = "";
        
        for (int i = caratteri.length()-1; i >= 0; i--) {
            amordnilap= amordnilap.concat(Character.toString(caratteri.charAt(i)));
            
        }
        
        System.out.println(amordnilap);
        return isPalindroma;
    }
}

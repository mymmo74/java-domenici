/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez13_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tss
 */
public class App1 {

    public static void main(String[] args) {
        // di solito si combinano le classi di lettura (FileReader legge da file, mentre
        // BufferedReader ha un metodo che ad esempio legge i caratteri e restituisce quando trova un fine riga
        try (BufferedReader br = new BufferedReader(new FileReader("/home/tss/esempio.txt"));) {
            
            String riga;
            
            while ((riga = br.readLine()) != null) {
                System.out.println(riga);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file non trovato...");
        } catch (IOException ex) {
            System.out.println("errore generico di IO...");
        }
    }

}

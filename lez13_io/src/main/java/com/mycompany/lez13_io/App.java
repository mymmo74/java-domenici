/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/home/tss/esempio.txt");) {
            int carattere;
            while ((carattere = fr.read()) != -1) {
                System.out.println((char) (carattere));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file non trovato...");
        } catch (IOException ex) {
            System.out.println("errore generico di IO...");
        }
    }

}

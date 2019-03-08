/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez13_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author tss
 */
public class App2 {
    // Con questo modo se si lavora con file e directory
    // libreria java.nio.file.*
    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("/home/tss/esempio.txt"))
                    .forEach(v->System.out.println(v));
            String testo="ciao a tutti\n è ora di intervallo\n";
            Files.write(Paths.get("/home/tss/esempio_scrittura.txt"), testo.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException ex) {
            System.out.println("Problemi generici di IO");
        }
    }
        

}

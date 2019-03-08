/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez13_io;

/**
 *
 * @author tss
 */
import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App5 {

    public static void main(String[] args) {
        try {
//            URLConnection con = new URL("https://www.google.it/").openConnection();
            URLConnection con = new URL("https://www.imparareaprogrammare.it/miglior-linguaggio-programmazione-iniziare").openConnection();
            
            // Dall'oggetto InputStream ottengo BYTES
            // Dando all'InputStreamReader traduco in CARATTERE
            // Con il BufferedReader ottengo una linea
            try (BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()))) {
                Path fileToWrite=Paths.get("/home/tss/esempio_scrittura.html");
                if (Files.exists(fileToWrite)){
                    Files.delete(fileToWrite);
                }
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                    Files.write(fileToWrite, inputLine.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println("Problemi con la connessione...");
        } catch (IOException ex) {
            System.out.println("Problemi di I-O");
        }
    }
}

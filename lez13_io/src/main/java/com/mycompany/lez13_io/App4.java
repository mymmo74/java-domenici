/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez13_io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class App4 {

    // Con questo modo se si lavora con file e directory
    // libreria java.nio.file.*
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.it");
            
            InputStream openStream = url.openStream();
            
            System.out.println(openStream);
        } catch (MalformedURLException ex) {
            Logger.getLogger(App4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App4.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
    }

}

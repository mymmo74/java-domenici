/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez12.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author tss
 */
public class App {
    
    
    
    public static void main(String[] args)  {
        
        // codice sotto il controllo dell'errore
        try {
            
            try (Connection cn = DbManager.openConnection()) {
                System.out.println("Connessione effettuata con successo!!");
                Scanner scanner= new Scanner(System.in);
                System.out.println("Inserisci le iniziali del cliente da cercare");
                String ricerca = scanner.nextLine();
                ResultSet risultato=DbManager.searchCustomerByName(cn, ricerca);
                System.out.println("----------- Clienti trovati ---------------------------");
                while (risultato.next()) {
                    String name = risultato.getString("customerName");
                    System.out.println(name);
                    
                }   risultato.close();
                // Se metto più catch, devo metterle nell'ordine prima la più specifica e poi quelle più generiche
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Scusa ma qualcosa è andato storto nell'esecuzione della query!!!");
        } catch (Exception ex){
            System.out.println("Qualcosa è andato storto...."+ex.getMessage()+ " tipo errore: "+ex.getClass());
        }
        
    }
}

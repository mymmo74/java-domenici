/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class DbManager {

    private final static String DRIVER = "org.mariadb.jdbc.Driver";
    //private final static String URL="jdbc:mariadb://localhost:3306/classicmodels";
    private final static String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private final static String USR = "root";
    private final static String PWD = "ghiglieno";

    // Metto il costruttore PRIVATE, così non può essere istanziato
    private DbManager() {

    }

    // Con la riga seguente si dice semplicemente che non vengono gestiti le eccezioni
    // public static Connection openConnection() throws ClassNotFoundException,SQLException {
    public static Connection openConnection() {
        Connection cn;

        try {
            // 1) PASSO: carica in memoria il driver
            // forName genera un eccezione OBBLIGATORIA, quindi da gestire
            // bisogna metterlo per forza in un blocco try catch
            // può generare ClassNotFoundException
            Class.forName(DRIVER);

            // 2) PASSO: aprire una connessione
            // può generare SQLException
            cn = DriverManager.getConnection(URL, USR, PWD);
            return cn;
        } catch (ClassNotFoundException | SQLException ex) {
            // gestione
            System.out.println("Connessione al DB fallita...");
            //genero mio errore
            //generando una mia eccezione, non c'è bisogno di ritornare qualcosa nel metodo (return cn)
            //perchè l'esecuzione si interrompe e va a cercare una gestione (nel nostro caso nel
            //metodo main di App
            throw new RuntimeException("Errore di connessione al DB");
        }

    }

    public static ResultSet executeQuery(Connection cn, String sql) {
        //devo sempre gestire l'SQLException
        //essendo Statement AUTOCLOSABLE, lui alla fine fa un "finally" ed effettua il CLOSE()
        // questo tipo di Try si chiama:
        // try with resources
        try (Statement cmd = cn.createStatement();) {
            return cmd.executeQuery(sql);
        } catch (SQLException ex) {
            throw new RuntimeException("Errore nell'esecuzione della query");
        } finally {
            System.out.println("Sono nel finally");
        }
    }

    public static ResultSet searchCustomerByName(Connection cn,String name) {
        return executeQuery(cn, "select * from customers "
                + " where customerName like '" + name + "%' order by customername");
    }
}

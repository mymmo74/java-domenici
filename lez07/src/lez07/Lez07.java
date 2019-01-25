///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lez07;
//
///**
// *
// * @author tss
// */
//public class Lez07 {
//    // A livello di classe posso solo dichiarare variabile o metodi...non istruzioni (es FOR)
//    
//    public static String msg = "sono visibile da tutta la classe";
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//        b = 20;
//
//// array
//        int[] a1 = {10, 20};
//        int[] b1 = a1;
//
//        b1[0] = 50;
//
//        System.out.println(a1[0]); // stampa 10 o 50?
//
//        String a2 = "tss";
//        String b2 = "tss";
//        String c2 = new String("tss");
//        System.out.println(a2 == c2); // ?? true da spiegare
//    }
//
//    public static void f1() {
//        System.out.println(a2); //a2 non viene vista perchè contenuta in "main"
//        System.out.println(msg); //msg è globale alla classe (quindi visibile da tutte le funzioni della classe)
//        
//        for (int i = 0; i < 10; i++) {
//            
//        }
//        System.out.println(i); // errore, i è visibile solo dentro il ciclo for
//        
//        {
//        // si possono dichiarare variabili che hanno visibilità solo qui dentro
//        }
//    }
//
//}

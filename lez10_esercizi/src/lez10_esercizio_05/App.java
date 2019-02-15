/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_05;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        T t1, t2;
        t1 = new T(0,0,0);
        t2 = new T(1, 45, 0);
//        System.out.println("t1=" + t1 + "-" + "t2=" + t2);
//        t1.setT(23, 63, 59);
//        System.out.println("t1=" + t1 + "-" + "t2=" + t2);
//        t1.setT(19, 21, 40);
//        System.out.println("t1=" + t1 + "-" + "t2=" + t2);
//        t1.addT(t2);
//        System.out.println("t1=" + t1 + "-" + "t2=" + t2);
        t1.subT(t2);
        System.out.println("t1=" + t1 + "-" + "t2=" + t2);
    } 
} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez10_esercizio_12;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class App {

    public static int maxid = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        A V[] = new A[10];
        for (int i = 0; i < V.length; i++) {
            V[i] = new M(0, "", 0);
        }
        do {
            System.out.println("[i]nserisci\n[m]odifica\n[e]limina\ne[x]it:");
            ch = in.next().toLowerCase().charAt(0);
            switch (ch) {
                case 'i': {
                    ins(V);
                    print(V);
                    break;
                }
                case 'm': {
                    mod(V);
                    print(V);
                    break;
                }
                case 'e': {
                    eli(V);
                    print(V);
                    break;
                }
                case 'x': {
                    System.out.println("fine prog.");
                    break;
                }
                default: {
                    System.out.println("scelta non valida");
                    break;
                }
            }//fine switch 
        } while (ch != 'x');
    }//fine main 

    static void eli(A V[]) { //elimina
        int i, j = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("ins.id:");
        i = in.nextInt();
        for (j = 0; j < V.length; j++) {
            if (V[j].getid() == i) {
                V[j] = new M(0, "", 0);
                break;
            }
        }
        for (j = 0; j < V.length - 1; j++)//compressione vettore
        {
            if (V[j].getid() == 0) {
                V[j] = V[j + 1];
                V[j + 1] = new M(0, "", 0);
            }
        }
    }//fine eli 

    static void mod(A V[]) { //modifica
        char ch;
        String voce;
        int prezzo, i, j = 0, id = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("ins.id:");
        i = in.nextInt();
        for (j = 0; j < V.length; j++) {
            if (V[j].getid() == i) {
                id = j;
                break;
            }
        }
        do {
            System.out.print("ins.voce:");
            voce = in.next();
            System.out.print("ins.prezzo:");
            prezzo = in.nextInt();
            V[id].setlista(voce, prezzo);
            System.out.print("Continuare?(S/N):");
            ch = in.next().toUpperCase().charAt(0);
        } while (ch == 'S');
    }//fine mod 

    static void print(A V[]) { //stampa
        for (int j = 0; j < V.length; j++) {
            if (V[j].getid() != 0) {
                System.out.println(V[j]);
            }
        }
    }//fine print 

    static void ins(A V[]) { //inserisci
        Scanner in = new Scanner(System.in);
        String m;
        char ch;
        int n = 4, i = 0;
        boolean e = false;
        for (i = 0; i < V.length; i++) {
            if (V[i].getid() == 0) {
                break;
            }
        }
        do {
            System.out.print("[M]otozappa [T]osaerba [D]ecesp. e[X]it:");
            ch = in.next().toUpperCase().charAt(0);
            if (ch == 'D' || ch == 'M' || ch == 'T') {
                System.out.print("ins.marca:");
                m = in.next();
                maxid++;
                if (ch != 'D') {
                    System.out.print("ins.n.ruote:");
                    n = in.nextInt();
                    if (ch == 'M') {
                        V[i] = new M(maxid, m, n);
                    } else {
                        V[i] = new T(maxid, m, n);
                    }
                } else {
                    System.out.print("acc.elettr.(0/1)?:");
                    n = in.nextInt();
                    if (n != 0) {
                        e = true;
                    } else {
                        e = false;
                    }
                    V[i] = new D(maxid, m, e);
                }
                i++;
            }//fine if 
        } while (ch != 'X' && i < 10);
    }// fine ins 
}//fine classe 

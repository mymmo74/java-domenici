/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez13_exception;

/**
 *
 * @author tss
 */
public class App {
    
    public static void main(String[] args) {
        
        try {
            // se il metodo method() va in errore
            System.out.println("-----start-------");
            method();
            //questa parte di codice non verrà eseguita
            System.out.println("proseguo senza erori...");
            System.out.println("---fine blocco senza errori-----");
            
        // perchè (se gestito) viene eseguito questa parte di codice 
        // se non fosse gestito, o gestito con un eccezione diversa
        } catch (Throwable ex) {
            System.out.println("Scusa qualcosa è andato storto");
            System.out.println(ex.getClass());
        }
        System.out.println("continuo imperterrito....");
        method1();
        System.out.println("-----end--------");
    }
    
    //metodo che richiama se stesso all'infinito.
    // lo stack delle chiamate va in overflow
    public static void method() {
        method();
        
    }

    private static void method1() {
        System.out.println("esecuzione method1... dopo stack overflow...");
    }
}

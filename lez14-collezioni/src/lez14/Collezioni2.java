/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez14;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author tss
 */
public class Collezioni2 {

    public static void main(String[] args) {
        Integer[] numeri = {34, 5, 7, 5, 8, 23};

//        Questo sotto non funziona perchè tento chiamare da un metodo statico (main) un metodo di istanza
//                o lo dichiaro static (il metodo) o faccio come sotto
//        Collection<Integer> soloDispari=rimuoviPari(
//                Arrays.asList(numeri) 
//        );
        Collection<Integer> soloDispari = new Collezioni2()
                .rimuoviPari(Arrays.asList(numeri));
        System.out.println(soloDispari);
    }

    /**
     * Ritornare una nuova collection senza i numeri pari
     *
     * @param numeri
     * @return
     */
    public Collection<Integer> rimuoviPari(Collection<Integer> numeri) {
        // creo una nuova collection
        Collection<Integer> result = new HashSet(numeri);
        
//        Uso iterator, perchè se usassi result e togliessi ogni volta 
//        vedi esempio giù, modifico ogni volto il size
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }

        }

//        
//        for(Integer numero:result){
//            if (numero % 2 == 0){
//                result.remove(numero);
//            }
//        }
        return result;

    }
}

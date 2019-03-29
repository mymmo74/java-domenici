/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez14;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tss
 */
public class Collezioni4 {

    public static void main(String[] args) {
        Integer[] numeri = {34, 5, 7, 5, 8, 23};

        List<Integer> listNumeri = Arrays.asList(numeri);
        listNumeri
                .stream()
                // elimina i doppi
                .distinct()
                // filtra per numeri pari
                .filter(numero -> numero%2==0)
                .map(numero -> calcola(numero))
                // per ogni numero fai quello specificato nelle graffe
                .forEach(numero -> System.out.println(numero));
                //metodo reference
//                .forEach(System.out::println);
    }
    
    private static long calcola(Integer n){
        return n*n;
    }
}

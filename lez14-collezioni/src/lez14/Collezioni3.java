/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author tss
 */
public class Collezioni3 {

    //MAPPE
    public static void main(String[] args) {
        Map<String, Integer> rubrica = new HashMap<>();

        // aggiungo una voce in rubrica
        rubrica.put("anna", 123456789);
        rubrica.putIfAbsent("anna", 123456);
        rubrica.put("mario", 000000);
        System.out.println(rubrica.get("anna"));

        // per scorrere una mappa
        // direttamente non ho iterator, ma ho il metodo
        // keySet che mi restituisce una collection, quindi li posso applicare iterator
        Iterator<String> iterator = rubrica.keySet().iterator();
        System.out.println("---- chiavi rubrica ----");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

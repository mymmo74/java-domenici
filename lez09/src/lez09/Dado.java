/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez09;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {

    public Dado() {
    }
    
    public int lanciaDado() {
        Random r=new Random();
        
        return r.nextInt(6)+1;
    }
}

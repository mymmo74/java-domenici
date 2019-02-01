
package lez09;

import java.util.Random;
/**
 *
 * @author tss
 */
public class GiocoDadi {
    public static void main(String[] args) {
        int soldi=10;
        while (soldi>0) {
            int puntiBanco=lanciaDado();
            int puntiGiocatore=lanciaDado();
            
            if (puntiGiocatore>puntiBanco){
                soldi++;
            } else{
                soldi--;
            }
            stampaMano(puntiBanco,puntiGiocatore, soldi);
        }
    }

    private static int lanciaDado() {
        Random r=new Random();
        
        return r.nextInt(6)+1;
    }

    private static void stampaMano(int puntiBanco, int puntiGiocatore, int soldi) {
        System.out.println("------------------giocata----------------------------");
        System.out.println(String.format("tiro giocatore --> %s, tiro banco -->%s ", puntiGiocatore, puntiBanco));
        System.out.println(String.format("soldi giocatore -->%s ", soldi));
    }
    
    
}

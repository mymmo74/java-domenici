/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class ContoCorrente {

    private final int numero;
    private final String intestatario;
    private double saldo;
    private final List<Movimento> movimenti = new ArrayList<>();
    // tutti i numeri in virgola nascono double, se lo voglio float, devo mettere f al fondo
    private static float interesse = 0.04f;

    // per richiamare da un costruttore in OVERLOAD si richiama con this(...)
    public ContoCorrente(int numero, String intestatario) {
        this(numero, intestatario, 0);
    }

    public ContoCorrente(int numero, String intestatario, double saldo) {
        this.numero = numero;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void prelievo(double somma) {
        if (saldo < somma || somma <= 0) {
            throw new IllegalArgumentException("La somma non è disponibile"); //genera una eccezione
        }
        movimenti.add(0, new Movimento(LocalDate.now(), TipoMovimento.PRELIEVO, somma));
        saldo -= somma;
    }

    //prelievo di default (se non si dice niente) di 100 € (senza chiedere la somma, parametro)
    // è in OVERLOAD quando uso metodi con lo stesso nome ma firma (firma è nomefunzione+parametri)
    public void prelievo() {
        prelievo(100);
    }

    public void deposito(double somma) {
        if (somma <= 0) {
            throw new IllegalArgumentException("deposito errato");
        }
        movimenti.add(0, new Movimento(LocalDate.now(), TipoMovimento.DEPOSITO, somma));
        saldo += somma;
    }

    public int getNumero() {
        return numero;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldo() {
        return saldo + (saldo * interesse);
    }

    public static void modificaInteresse(float valore) {
        if (valore < 0) {
            throw new IllegalArgumentException("Interesse negativo non permesso");

        }
        interesse = valore;
    }

    public List<Movimento> estrattoConto(int num) {
        return movimenti.stream().limit(num).collect(Collectors.toList());
    }

    public List<Movimento> estrattoDepositi(int num) {
        return movimenti.stream()
                .filter(movimento -> movimento.getImporto() > 0)
                .limit(num)
                .collect(Collectors.toList());
    }

    // dentro la classe vo
    public static class Movimento {

        private final LocalDate data;
        //enumerazione: in un nuovo file
        private final TipoMovimento tipoMovimento;
        private final double importo;

        private Movimento(LocalDate data, TipoMovimento tipoMovimento, double importo) {
            this.data = data;
            this.tipoMovimento = tipoMovimento;
            this.importo = importo;
        }

        public LocalDate getData() {
            return data;
        }

        public TipoMovimento getTipoMovimento() {
            return tipoMovimento;
        }

        public double getImporto() {
            return importo;
        }

    }

}

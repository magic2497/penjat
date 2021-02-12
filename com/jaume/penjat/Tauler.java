package com.jaume.penjat;

import java.util.Arrays;

public class Tauler {
    private char[] paraulaSecreta;
    private int intents;
    private String[] palabraEndevinada;

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;

    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;

    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public void inicialitzarPartida(String paraula, int intents) {


        char[] cadena = paraula.toCharArray();
        String[] cadena2 = new String[cadena.length];



        setParaulaSecreta(cadena);
        setIntents(intents);
        setPalabraEndevinada(cadena2);

    }

    public String verificar(String letra) {
        if (letra.length() == 1) {
            boolean estado = true;
            for (int i = 0; i < paraulaSecreta.length; ++i) {
                if (letra.charAt(0) == paraulaSecreta[i]) {
                    palabraEndevinada[i] = letra;
                    estado = false;
                }

            }
            if (estado) {
                intents = intents - 1;
            }

        } else {
            letra = "Lletra incorrecte";

        }
        return letra;
    }

    public String imprimir() {
        String paraula = "";
        for (int i = 0; i < palabraEndevinada.length; i++) {

            if (palabraEndevinada[i] == null) {
                paraula = paraula + "_";
            } else {
                paraula = paraula + palabraEndevinada[i];
            }
        }


        return paraula;
    }

    public String imprimirVides() {
        int intents = getIntents();
        String vides = "";
        if (intents > 1) {
            vides = "Et queden" + " " + getIntents() + " " + "vides de 4";
        } else {
            vides = "Et queda" + " " + getIntents() + " " + "vida de 4";
        }


        return vides;
    }

    public boolean hasGuanyat(){
        boolean estatPartida = false;
        String palabraSecreta = new String(this.paraulaSecreta);
        String palabraEndevinada = String.join("",this.palabraEndevinada);

        int intents = getIntents();

        if (intents >= 1 && palabraSecreta.equals(palabraEndevinada) ) {
            estatPartida = true;
        }

        return estatPartida;
    }
}






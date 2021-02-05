package com.jaume.penjat;

public class Tauler {
    public void inicialitzarPartida(String paraulaSecreta, int intents) {
        this.intents = intents;
    }
    private char[] paraulaSecreta;
    private int intents;

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



    public char[] getParaulaSecreta(String paraula) {
        String sCadena = paraula;
        char[] aCaracteres = sCadena.toCharArray();
        return aCaracteres;
    }

    public String verificar(String letra) {
        if (letra.length() == 1) {
            letra = "Lletra correcte";
        } else {
            letra = "Lletra incorrecte";
        }

        return letra;
    }

}


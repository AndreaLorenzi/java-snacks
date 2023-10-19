package org.lesson.java.snack;

public class Snack5 {
    public static void main(String[] args) {
        String numeroStringa = "123456789";
        int numeroIntero = convertiInIntero(numeroStringa);
        System.out.println(numeroIntero);
    }

    public static int convertiInIntero(String numeroStringa) {
        int lunghezza = numeroStringa.length();
        int risultato = 0;

        for (int i = 0; i < lunghezza; i++) {
            char carattere = numeroStringa.charAt(i);

            // Verifica se il carattere è un numero
            if (carattere >= '0' && carattere <= '9') {
                int valoreCarattere = carattere - '0';
                risultato = risultato * 10 + valoreCarattere;
            }
        }

        return risultato;
    }
}

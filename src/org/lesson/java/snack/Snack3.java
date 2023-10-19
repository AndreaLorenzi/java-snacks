package org.lesson.java.snack;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int totaleSommaPosDispari = 0;

        for (int i = 1; i < numeri.length; i++) {
            if (i % 2 == 1) {
                int numero = numeri[i];
                totaleSommaPosDispari += numero;
            }

        }

        System.out.println("Somma totale degli elementi in posizione dispari: " + totaleSommaPosDispari);
    }
}

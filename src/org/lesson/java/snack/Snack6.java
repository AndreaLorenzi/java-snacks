package org.lesson.java.snack;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        // Acquisisci il numero di secondi dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di secondi: ");
        int totalSecondi = scanner.nextInt();

        // Chiudi lo scanner per evitare leak di risorse
        scanner.close();

        // Calcola ore, minuti e secondi
        int ore = totalSecondi / 3600;
        int minuti = (totalSecondi % 3600) / 60;
        int secondi = totalSecondi % 60;

        // Genera la stringa nel formato "hh:mm:ss"
        String tempoFormat = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        // Stampa il risultato
        System.out.println("Il tempo convertito è: " + tempoFormat);
    }

}

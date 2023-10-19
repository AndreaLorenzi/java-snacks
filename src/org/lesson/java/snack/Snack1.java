package org.lesson.java.snack;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci un numero: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Hai inserito un numero negativo. Il programma termina.");
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("Il numero è pari: " + numero);
            } else {
                System.out.println("Il numero è dispari, il numero successivo è: " + (numero + 1));
            }
        }
        scanner.close();
    }
}

package org.lesson.java.snack;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        //apro lo scanner
        Scanner scanner = new Scanner(System.in);
        //chiedo all'utente di inserire una parola
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        StringBuilder palindrome = new StringBuilder();

        for (int i = parola.length() - 1; i >= 0; i--) {
            palindrome.append(parola.charAt(i));
        }
        if (parola.contentEquals(palindrome)) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("la parola non è palindroma");
        }
        scanner.close();
    }
}

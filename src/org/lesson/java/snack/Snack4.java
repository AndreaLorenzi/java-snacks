package org.lesson.java.snack;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        //apro lo scanner
        Scanner scanner = new Scanner(System.in);
        //chiedo all'utente di inserire una parola
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        
        //chiudo lo scanner
        scanner.close();
    }
}

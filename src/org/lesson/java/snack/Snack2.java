package org.lesson.java.snack;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        //creo arrey con nomi e cognomi
        String[] nomi = {"Antonio", "Manuel", "Lamberto", "Giacomo", "Vadim", "Paolo", "Gianluca", "Matteo", "Wilmer"};
        String[] cognomi = {"Pepe", "Nicolaci", "Elia", "Pierino", "Marcolini", "Cortassi", "Marittimi", "Steroidi", "Marini"};

        //idtanzio il generatore random
        Random random = new Random();
//creo il ciclo per far si che si incrocino in maniera casuale i nomi con i cognomi
        System.out.println("FInta lista invitati: ");
        for (int i = 0; i < 10; i++) {
            String nomeCasuale = nomi[random.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[random.nextInt(cognomi.length)];
            System.out.println(nomeCasuale + " " + cognomeCasuale);
        }
    }
}

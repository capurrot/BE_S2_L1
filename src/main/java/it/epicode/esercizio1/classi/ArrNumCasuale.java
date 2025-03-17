package it.epicode.esercizio1.classi;

import it.epicode.esercizio1.exceptions.NumeroArrayException;

import java.util.Scanner;

public class ArrNumCasuale {
    //crea un array di 5 numeri casuali compresi tra 1 e 10
    void arrNum() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.floor(Math.random() * 10) + 1);
            System.out.println(array[i]);
        }

        boolean ciclo = true;
        while (ciclo) {

            try {
                //chiedi all'utente di inserire un numero in una posizione specifica dell'array
                Scanner scanner = new Scanner(System.in);
                System.out.println("inserisci un numero da 1 a 10 o 0 per uscire");
                int num =  scanner.nextInt();
                if (num == 0) {
                    ciclo = false;
                    continue;
                } else if (num < 0 || num > 10) {
                    throw new NumeroArrayException("Il numero deve essere tra 1 e 10 o 0 per uscire");
                }
                System.out.println("inserisci la posizione tra 1 e 5");
                int pos = scanner.nextInt() - 1;
                if (pos < 1 || pos > 5) {
                    throw new NumeroArrayException("La posizione deve essere tra 1 e 5");
                }
                array[pos] = num;
                System.out.println("Hai inserito il numero " + num + " nella posizione " + pos);
                for (int j : array) {
                    System.out.println(j);
                }
            } catch (NumeroArrayException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package it.epicode.esercizio2.classi;

import it.epicode.esercizio1.exceptions.NumeroArrayException;
import it.epicode.esercizio2.exceptions.NumeroLitriException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci la distanza in chilometri");
            double km = scanner.nextDouble();
            System.out.println("Inserisci il consumo in litri");
            double litri = scanner.nextDouble();
            if (litri == 0) {
                throw new NumeroLitriException("Il consumo non può essere 0");
            }
            CalcolaKmLitro calcolaKmLitro = new CalcolaKmLitro(km, litri);
        } catch (NumeroLitriException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

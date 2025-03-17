package it.epicode.esercizio2.classi;
public class CalcolaKmLitro {

    public CalcolaKmLitro(double km, double litri) {
        double consumo = km / litri;
        System.out.println("Il consumo è di " + consumo + " km per litro");
    }
}

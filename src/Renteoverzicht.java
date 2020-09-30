import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {
        //variabele s voor gebruikersinvoer getal
        Scanner s = new Scanner(System.in);
        System.out.println("Wat is je naam?");
        String naam = s.nextLine();
        System.out.println("welkom " + naam);
        System.out.println("Welk bedrag wil je inleggen?");
        double bedrag = s.nextDouble();
        System.out.println(bedrag);

        System.out.println("Hoeveel jaar wil je sparen?");
        int jaar = s.nextInt();
        System.out.println(jaar);

        float rente;
        if (bedrag > 1000) {
            rente = (float) 0.002;
        } else if (bedrag >= 600 & bedrag <= 1000) {
            rente = (float) 0.01;
        } else if (bedrag >= 300 & bedrag < 600) {
            rente = (float) 0.02;
        } else if (bedrag >= 100 & bedrag < 300) {
            rente = (float) 0.03;
        }
        else if (bedrag >= 0 & bedrag < 100) {
            rente = 0;
        } else {
            rente = (float) 0.1;
        }

        if (bedrag >= 0) {
        //string voor weergeven ingevoerde gegevens en bijbehorende rente
        String zin = "Beste " + naam + ", dit is je spaaroverzicht met een beginbedrag van " + bedrag + " met een jaarlijkse rente van " + rente * 100 + "%";
        //zin weergeven
        System.out.println(zin);
        }

        else {
            //string voor weergeven ingevoerde gegevens en bijbehorende rente
            String zin = "Beste " + naam + ", dit is je overzicht met een schuld van " + bedrag + " met een jaarlijkse debetrente van " + rente * 100 + "%";
            //zin weergeven
            System.out.println(zin);
        }



        //variabele aanmaken voor output tafel
        String output;

        // getallen van een tot tien in lus aanmaken
        for (int x = 1; x <= jaar; x++) {
            //getal wordt elk jaar vermeerderd met rente r
            bedrag = bedrag + bedrag * rente;
            //string weergeven voor rentes afgerond op 2 decimalen
            System.out.printf("%n Jaar " + x + ": %.2f", bedrag);
        }


    }
}

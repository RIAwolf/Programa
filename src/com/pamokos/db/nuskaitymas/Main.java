package com.pamokos.db.nuskaitymas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Labas, kuria uzduoti norite vykdyti, iveskite sveika skaiciu tarp 1 ir 6");
        int numeris = skaneris.nextInt();
        switch (numeris) {
            case 1:
                PirmaUzduotis objektas1 = new PirmaUzduotis();
                objektas1.pasisveikinimas();
                objektas1.nuskaitymas();
                objektas1.spausdinimas();
                break;

        }


    }
}

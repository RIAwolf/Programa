package com.pamokos.db.nuskaitymas;

import java.util.Scanner;

/**
 * Created by user on 5/22/2017.
 */
public class PirmaUzduotis {
    private String vardas;

    public PirmaUzduotis(){

    }

    // 1 paprasyti vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("Iveskite vartotojo varda");
    }

    // 2 nuskaityti vartotojo varda
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        vardas = skaneris.nextLine();
    }

    // 3 atspausdinti ji 5 kartus
    public void spausdinimas() {
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }
}

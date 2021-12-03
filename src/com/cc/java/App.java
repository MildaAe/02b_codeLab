package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto("konto1");
        Konto konto2 = new Konto("konto2");
        Konto konto3 = new Konto("konto3");
        

        konto1.kontostandAusgeben();
        konto2.kontostandAusgeben();
        konto3.kontostandAusgeben();

        System.out.println("_______________________");
        System.out.println("");

        // konto1.kontostandMultiplizieren(2);
        // konto2.kontostandMultiplizieren(3);
        // konto3.kontostandMultiplizieren(10);

        konto1.kontostandBerechnen("*", 2);
        konto2.kontostandBerechnen("*", 3);
        konto3.kontostandBerechnen("*", 10);

        konto1.kontostandAusgeben();
        konto2.kontostandAusgeben();
        konto3.kontostandAusgeben();
    }

}

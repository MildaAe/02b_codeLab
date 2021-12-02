package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        System.out.println(konto1.kontostand);
        System.out.println(konto2.kontostand);
        System.out.println(konto3.kontostand);

        konto1.kontostand = konto1.kontostand * 2;
        konto2.kontostand = konto2.kontostand * 3;
        konto3.kontostand = konto3.kontostand * 10;

        System.out.println(konto1.kontostand);
        System.out.println(konto2.kontostand);
        System.out.println(konto3.kontostand);


    }

}

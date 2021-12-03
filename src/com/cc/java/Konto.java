package com.cc.java;

public class Konto {
    
    private String name;
    private int kontostand = 10000;

    public Konto(String name) {
        this.name = name;
    }

    public Konto(String name, int kontostand) {
        this.kontostand = kontostand;
        this.name = name;
    }

    public void kontostandAusgeben(){
        System.out.println("Der aktuelle Kontostand von " + this.name + " liegt bei: " + this.kontostand + "€");
    }

    public void kontostandMultiplizieren(int faktor){
        this.kontostand = this.kontostand * faktor;
    }

    public void kontostandBerechnen(String operator, int zahl){
        switch (operator) {
            case "+":
            this.kontostand = this.kontostand + zahl;
                break;
            case "-":
            this.kontostand = this.kontostand - zahl;
                break;   
            case "*":
            this.kontostand = this.kontostand * zahl;
                break; 
            case "/":
            this.kontostand = this.kontostand / zahl;
                break; 
                
            default:
                break;
        }
    }
}

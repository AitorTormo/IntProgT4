package com.java;

public class Main {

    public static void main(String[] args) {

        int varNumeroIf = 3;

        if (varNumeroIf < 0){
            System.out.println("Variable es negativa");
        } else if (varNumeroIf > 0){
            System.out.println("Variable es positiva");
        } else {
            System.out.println("Variable es 0");
        }

        System.out.println(" ");


        int numeroWhile = -5;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println(" ");

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);

        System.out.println(" ");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        System.out.println(" ");

        var estacion = "Verano";

        switch(estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es una estación válida");
        }










    }
}

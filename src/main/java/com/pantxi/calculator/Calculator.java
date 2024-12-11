package com.pantxi.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD){
        return opG + opD;
    }

    public static int divide(int opG, int opD){
        return opG / opD;}

    // Méthode qui retourne l'ensemble des chiffres d'un nombre
    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        // Prendre la valeur absolue pour gérer les nombres négatifs
        int nombre = Math.abs(pNombre);

        // Extraire les chiffres un par un
        while (nombre > 0) {
            chiffres.add(nombre % 10); // Ajouter le dernier chiffre
            nombre /= 10;             // Supprimer le dernier chiffre
        }

        return chiffres;
    }

    // Main pour tester rapidement
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.ensembleChiffres(7679)); // Résultat attendu : [6, 7, 9]
        System.out.println(calc.ensembleChiffres(-11)); // Résultat attendu : [1]
    }
}

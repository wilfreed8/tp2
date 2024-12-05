package com.pantxi.calculator;

import com.pantxi.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    // Méthode exécutée avant chaque test
    @BeforeEach
    void setUp() {
        calculator= new Calculator(); // Initialiser l'objet Calculat
    }

    // Méthode exécutée après chaque test
    @AfterEach
    void tearDown() {
        calculator = null; // Libération des ressource;
    }
    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3",

    })
void testadd(int a,int b,int expected) {
        assertEquals(expected, calculator.add(a, b), "Soustraction incorrecte !");
    }
    @Test

    void add_devrait_calculer_la_some_de_deux_int() {
        //Test de la methode add

        assertEquals(5, Calculator.add(2, 3), "l addition de 2 par 3 devrait etre 5");
        assertEquals(-1, Calculator.add(2, -3), "l addition de 2 par -3 devrait etre -1");
        assertEquals(9, Calculator.add(6, 3), "l addition de 6 par 3 devrait etre 9");
    }
    @Test
    void divide() {
        //Test de la methode add
        assertEquals(5, Calculator.divide(10, 2), "la division de 10 par 2 devrait etre 5");
        assertEquals(-1, Calculator.divide(3, -3), "la division de 3 par -3 devrait etre -1");
        assertEquals(6, Calculator.divide(18, 3), "la division de 18 par 3 devrait etre 6");
    }

}


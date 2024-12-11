package com.pantxi.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add_devrait_calculer_la_somme_de_deux_entiers(){
        assertEquals(5,Calculator.add(2,3), "2+3 devrait donner comme resulat 5");
        assertEquals(10,Calculator.add(5,5), "5+5 devrait donner comme resulat 5");
        assertEquals(-1,Calculator.add(2,-3), "2+(-3) devrait donner comme resulat 5");

    }

    @Test
    void divide_devrait_calculer_la_division_de_deux_entiers(){
        assertEquals(1,Calculator.divide(3,2), "3/2 devrait donner comme resulat 1");
        assertEquals(5,Calculator.divide(10,2), "10/2 devrait donner comme resulat 5");
        assertEquals(-2,Calculator.divide(-2,1), "-2/1 devrait donner comme resulat -1");

    }
}

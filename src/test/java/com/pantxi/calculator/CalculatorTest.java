package com.pantxi.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTest {
    Calculator calculator ;
    @BeforeEach
            public void setUp() {
        calculator = new Calculator();
        System.out.println("setUp");
    }
    @AfterEach
    public void tearDown() {
        calculator=null;
        System.out.println("tearDown");

    }

    @Test
    void add_devrait_calculer_la_somme_de_deux_entiers(){
        assertThat(calculator.add(1,2)).isEqualTo(3);
        assertThat(calculator.add(4,5)).isEqualTo(9);



        /*assertEquals(5,Calculator.add(2,3), "2+3 devrait donner comme resulat 5");
        assertEquals(10,Calculator.add(5,5), "5+5 devrait donner comme resulat 5");
        assertEquals(-1,Calculator.add(2,-3), "2+(-3) devrait donner comme resulat 5");*/

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
        assertEquals(expected, calculator.add(a, b), "addition incorrecte !");
    }


    @Test
    void divide_devrait_calculer_la_division_de_deux_entiers(){
        assertThat(calculator.divide(10,5)).isEqualTo(2);
        assertThat(calculator.divide(18,3)).isEqualTo(6);

        /*
        assertEquals(1,Calculator.divide(3,2), "3/2 devrait donner comme resulat 1");
        assertEquals(5,Calculator.divide(10,2), "10/2 devrait donner comme resulat 5");
        assertEquals(-2,Calculator.divide(-2,1), "-2/1 devrait donner comme resulat -1");*/

    }
}

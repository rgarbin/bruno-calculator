package com.test.calculator;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    CalculatorService calculator;

    @Before
    public void setUp(){
        calculator = new CalculatorService();
    }


    @Test
    public void testSoma(){

        Integer expectedResult = 4;

        Integer result = calculator.soma(2,2);

        assertEquals(expectedResult,result);
    }

    @Test
    public void testSubtracao(){
        Integer expectecresult = 4;

    Integer result = calculator.subtracao(8,4);

    assertEquals(expectecresult,result);

    }


    @Test
    public void testDiv(){
        Integer expectecresult = 4;

        Integer result = calculator.divisao(16,4);

        assertEquals(expectecresult,result);

    }

    @Test
    public void testMult(){
        Integer expectecresult = 4;

        Integer result = calculator.multiplicacao(2,2);

        assertEquals(expectecresult,result);

    }

}

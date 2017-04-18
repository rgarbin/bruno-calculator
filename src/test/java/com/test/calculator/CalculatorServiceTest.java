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

}

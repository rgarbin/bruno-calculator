package com.test.calculator;

/**
 * Created by bruno.mendes on 18/04/2017.
 */
public class CalculatorService {

    public Integer soma(Integer numOne,Integer numTwo){
        Integer result = numOne + numTwo;
        return result;
    }

    public Integer subtracao(Integer numOne,Integer numTwo){
        Integer result = numOne - numTwo;
        return result;
    }

    public Integer divisao(Integer numOne,Integer numTwo){
        Integer resul = numOne / numTwo;
        return resul;
    }

    public Integer multiplicacao( Integer numOne,Integer numTwo){
        Integer resul = numOne * numTwo;
        return resul;

    }



}

package main.java;

import java.util.IllformedLocaleException;

/**
 * Created by RajatGarg on 3/7/2017.
 */
public class Calculator {
    public static int add(int number1,int number2){
        return number1 + number2;
    }

    public static int sub(int number1,int number2){
        return number1-number2;
    }

    public static int mul(int number1,int number2){
        return number1*number2;
    }

    public static int divInt(int number1,int number2){
        if(number2==0)
            throw new IllegalArgumentException("Can't be zero");
        return number1/number2;
    }

    public static double divReal(int number1,int number2){
        if(number2==0)
            throw new IllegalArgumentException("Can't be zero");
        return (double) number1/number2;
    }
}

package com;

/**
 * Created by RajatGarg on 3/8/2017.
 */
public class MyNumber {
    int number;

    public MyNumber(){
        this.number = 0;
    }

    public MyNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyNumber add(MyNumber rhs){
        this.number += rhs.number;
        return this;
    }

    public MyNumber div(MyNumber rhs){
        if(rhs.number == 0)
            throw new IllegalArgumentException("Can't divide by Zer0");
        this.number /= rhs.number;
        return this;
    }
}

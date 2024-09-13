package com.javaPrograming.day1workingwithprimitives.Task;

public class ArthematicOperations1 {
    int a = 4;
    float b =2.8f;
    double c;
    //Type casting
    public ArthematicOperations1() {

        double A = (double) (a);
        double B = (double) (b);
        c = A + B;
    }

    public static void main(String[] args) {
        ArthematicOperations1 var = new ArthematicOperations1();
        System.out.println(var.c);
    }
}
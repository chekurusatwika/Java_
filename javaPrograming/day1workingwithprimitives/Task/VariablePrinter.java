package com.javaPrograming.day1workingwithprimitives.Task;

public class VariablePrinter {
    int instanceVar;

    public static void main(String[] args) {
        VariablePrinter var = new VariablePrinter();
        var.instanceVar = 55;
        System.out.println("The instance variable is : " + var.instanceVar);
    }
}

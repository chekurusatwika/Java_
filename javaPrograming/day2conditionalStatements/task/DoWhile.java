package com.javaPrograming.day2conditionalStatements.task;

public class DoWhile {
    public static void main(String[] args) {
        int val = 5;
        do {
            val++;
            System.out.println(val);
            System.out.println("Inside Do-While Loop");
        }while(val < 15);
    }
}

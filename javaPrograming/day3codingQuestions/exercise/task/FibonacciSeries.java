package com.javaPrograming.day3codingQuestions.exercise.task;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibonacci series: " + n1 + " " + n2);
        int n3 = n2 + n1;
        while(n3 < 1000){
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
            n3 = n2 + n1;


        }




    }
}

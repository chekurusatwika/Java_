package com.javaPrograming.day3codingQuestions.exercise;
//even or odd 
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : " );
        int num = scanner.nextInt();
        if(num % 2 == 0)
            System.out.println( num + "is even number");
        else
            System.out.println(num + " is odd number");
    }

}

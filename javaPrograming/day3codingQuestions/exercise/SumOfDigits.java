package com.javaPrograming.day3codingQuestions.exercise;
//sum of digits
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        int sum = 0;
        while(num != 0 ) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
            System.out.println(sum + " is the sum of the digits in given number");

    }
}

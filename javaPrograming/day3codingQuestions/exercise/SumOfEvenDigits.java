package com.javaPrograming.day3codingQuestions.exercise;
//sum of even digits
import java.util.Scanner;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while(num != 0){
            if(num % 2 == 0){
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println( "even digits sum " + sum);
    }
}

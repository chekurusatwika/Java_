package com.javaPrograming.day3codingQuestions.exercise;

import java.util.Scanner;
//prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: " );
        int num = scanner.nextInt();
        int countFactor = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                countFactor++;

        }
        if(countFactor == 2){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is not prime");

        }
    }
}

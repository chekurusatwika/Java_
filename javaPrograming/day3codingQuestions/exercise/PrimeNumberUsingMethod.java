package com.javaPrograming.day3codingQuestions.exercise;

import java.util.Scanner;

public class PrimeNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range : ");
        int maxLimit = scanner.nextInt();
        for(int no = 1; no <= maxLimit; no++) {
            boolean isPrime = isPrime(no);
            if(isPrime){
                System.out.println(no);
            }
        }



    }
    public static boolean isPrime(int number){
        if(number <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;

    }
}

package com.javaPrograming.day2conditionalStatements.task;
//Nested For Loop With Continue
public class NestedForLoopWithContinue {
    public static void main(String[] args) {
        for(int i =0 ; i < 5; i++){
            for(int j =0 ; j < 6 ; j++){
                if(i <= j)
                    continue;
                System.out.println(i + " " + j);

            }//for
        }//for
    }
}

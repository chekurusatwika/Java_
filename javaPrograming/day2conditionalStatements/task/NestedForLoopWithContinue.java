package com.javaPrograming.day2conditionalStatements.task;

public class NestedForLoop {
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

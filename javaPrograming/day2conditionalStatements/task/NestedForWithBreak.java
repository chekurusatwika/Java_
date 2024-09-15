package com.javaPrograming.day2conditionalStatements.task;

public class NestedForWithBreak {
    public static void main(String[] args) {
        outer:for(int i =0; i<5 ; i++){
            inner:for(int j =0 ; j<4 ; j++){
            if( i == j)
              break ;
            System.out.println(i + " " + j);

            }

        }
    }
}

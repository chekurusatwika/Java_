package com.javaPrograming.day1workingwithprimitives.Exercise;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        byte a = 19;
        int b = a;
        System.out.println("implicit type casting value : " + b);

        long l = 25000004587925L;
        int c = (int)l;
        System.out.println("explicit typecasting value : " + c);

        //in implicit type conversion ,the compiler itself converts from smaller datatype to larger
        //in explicit type conversion there would be data loss


    }
}

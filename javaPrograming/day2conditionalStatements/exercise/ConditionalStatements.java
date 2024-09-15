package com.javaPrograming.day2conditionalStatements.exercise;

public class ConditionalStatements {
    public static void main(String[] args) {
        char membership;
        membership = 'D';
        int price;
        price = 500000;
        byte discountPercentage;
        int discount;
        int finalPrice;
        if(membership == 'D'){
            discountPercentage = 20;
        }else if(membership == 'G'){
            discountPercentage = 15;
        }else if(membership == 'S'){
            discountPercentage = 10;
        }else{
            discountPercentage = 5;
        }
        discount=  (price * discountPercentage)/100;
        finalPrice = price - discount;
        System.out.println("discount amount : " + discount);
        System.out.println("discount percentage : " + discountPercentage);
        System.out.println("final price after discount : " + finalPrice);


    }


}

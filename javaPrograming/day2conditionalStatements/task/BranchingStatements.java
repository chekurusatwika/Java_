package com.javaPrograming.day2conditionalStatements.task;
//branching Statements
public class BranchingStatements {
    public static void main(String[] args) {
        char membership;
        membership = 'D';
        int price;
        price = 500000;
        byte discountPercentage;
        int discount;
        int finalPrice;
        String brand = "Apple";
        switch(brand){
            case "samsung" :
                if(membership == 'D'){
                    discountPercentage = 20;
                }else if(membership == 'G'){
                    discountPercentage = 15;
                }else if(membership == 'S'){
                    discountPercentage = 10;
                }else{
                    discountPercentage = 5;
                }
                break;

            case "Apple" :
                if(membership == 'D'){
                    discountPercentage = 30;
                }else if(membership == 'G'){
                    discountPercentage = 25;
                }else if(membership == 'S'){
                    discountPercentage = 20;
                }else{
                    discountPercentage = 10;
                }
                break;
            default :
                discountPercentage = 1;

        }//switch
        discount=  (price * discountPercentage)/100;
        finalPrice = price - discount;
        System.out.println("discount amount : " + discount);
        System.out.println("discount percentage : " + discountPercentage);
        System.out.println("final price after discount : " + finalPrice);

    }//main
}//class

package com.javaPrograming.day1workingwithprimitives.Task;

public class VariableTypes {
        byte instanceVar; // instance variable
    static int sVal = 20; // class variable or static variable
    static String name = "Satwika";

    public void setName(String str){ // local variable
        System.out.println("the string name is : " + str);
    }

    public static void main(String[] args) {
        VariableTypes var = new VariableTypes();
        System.out.println("The static value is : " + VariableTypes.sVal);
        System.out.println("The static Name is : " + VariableTypes.name);
        var.instanceVar = 20;
        System.out.println("The instance variable is : " + var.instanceVar);
        var.setName("hi world");



    }
}

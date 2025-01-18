package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /*
        Create a program that has two numerical variables - x and y
        Assign a value of 20 to x
        Perform a logical ternary check that will assign 90 to y after checking whether the value of x is equal to 1
        Print out "value of y is: " + y
        Perform a second logical ternary check that will assign 61 to y after checking whether the value of x is equal to 20
        Print out "value of y is: " + y
        */
        int x = 1;
        int y = 0;

        y = x == 1 ? 90 : y;
        System.out.println(y);
        y = x == 20 ? 61 : y;
        System.out.println(y);
        response = String.valueOf(y);
        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}

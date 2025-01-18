package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){

        int fare = 0;

        /* Put your code in between these comments : Top */
        if (age < 11) {
            fare = 3;
        } else if (age >= 11 && age < 65) {
            fare = 5;
        } else {
            fare = 3;
        }
        /* Put your code in between these comments : Bottom */



        return fare;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input age");
        age = scan.nextInt();
        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println("fare = " + String.valueOf(computeOutput) + "$");


    }
}

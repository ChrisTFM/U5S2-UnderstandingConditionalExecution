package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("What was your grade in Math?");
        int math = scan.nextInt();
        System.out.println("What was your grade in Science?");
        int sci = scan.nextInt();
        System.out.println("What was your grade in Geography?");
        int geo = scan.nextInt();
        System.out.println("What was your grade in English?");
        int eng = scan.nextInt();
        System.out.println("What was your grade in Java?");
        int jav = scan.nextInt();

        int total_grade = math + sci + geo + eng + jav;

        response = "Total grade = " + String.valueOf(total_grade) + "\nMy percentage: " + String.valueOf(total_grade / 5);
        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}
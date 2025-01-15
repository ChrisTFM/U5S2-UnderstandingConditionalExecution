package com.codedifferently.labs.partA.ex02;

public class TernaryOperator {
    public static String modify(){
        String response = "";

        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }

        // Use a ternary operator to perform the same logic as above.

        String strX = (y / x < 3) ? String.valueOf(x += y) : String.valueOf(x *= y);


        response += ("After if stmt, x = " + strX);

        return response;

    }



    public static void main(String[] args) {
        String modifyOutput = modify();
        System.out.print(modifyOutput);
    }
}

package com.codedifferently.labs.partA.ex01;

public class WatchMovie {
    public static String watchMovie() {
        String response = "";
        /* Your code goes here*/
        Integer movieRating = 5;
        Integer Price = 12;

        if (Price <= 12 && movieRating >= 5) {
            response = "Im interested in watching the movie";
        }
        else {
            response = "I am not interested in watching the movie";
        }
        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}

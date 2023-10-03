package com.PabloDiaz.demo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        */


        /*

        int tia = 10;
        int nolla = 0;

        try {
            int result = tia / nolla;
            System.out.println("Resultatet är: " + result);
        } catch (Exception e) {
            System.out.println("Det går inte att dividera med noll");
        }

        for (;;) {
            System.out.println("Krasch!");
        }

         */

        int a = 10;
        int b = 0;

        if (((b == 0))) {
            System.out.println("Krasch!");
        } else {
            int result = a / b;
            System.out.println("Resultatet är: " + result);
        }

    }
}
package com.company;

import java.util.Arrays;


public class Main {


    public static void main(String[] args) {

        double[] arrayBig = {112.5, 65.5, 15, 1.6, 47.9, -6.1, 32.1, -53.0, 22.6, -3.7, 12.4, -72.1, 43.4, 14.4, -9.1};
        boolean positive = false;
        double theAmount = 0;
        double numbers = 0;
        for (double array : arrayBig) {
            if (positive) {
                theAmount += array;
                numbers++;
            } else if (array < 0.0) {
                positive = true;
            }
        }
        double dividedByQuantity = (theAmount / numbers);

        boolean sortTheNumbers = false;
        double exchange;
        while (!sortTheNumbers) {
            sortTheNumbers = true;
            for (int i = 0; i < arrayBig.length - 1; i++) {
                if (arrayBig[i] > arrayBig[i + 1]) {
                    sortTheNumbers = false;

                    exchange = arrayBig[i];
                    arrayBig[i] = arrayBig[i + 1];
                    arrayBig[i + 1] = exchange;
                }
            }
        }
        System.out.println("Среднее арифметическое число: " + dividedByQuantity);
        System.out.println(Arrays.toString(arrayBig));


    }
}



package fr.algorithmie;

import java.util.Arrays;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array    = {4, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        boolean result = (array.length > 0)  && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println("result: " + result);


    }



}

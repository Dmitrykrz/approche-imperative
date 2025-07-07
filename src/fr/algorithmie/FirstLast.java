package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array    = {4, 15, -3, 0,0, 14, 4};

        boolean result = (array.length >= 1) && (array[0]==array[array.length - 1]) ;

        System.out.println("result: " + result);


    }


}

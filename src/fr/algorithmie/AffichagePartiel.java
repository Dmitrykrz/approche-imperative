package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};


        System.out.println(">3: ");
        for (int v : array) {
            if (v > 3) System.out.print(v + " ");
        }
        System.out.println();


        System.out.println("pairs:");
        for (int v : array) {
            if (v % 2 == 0) System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("index pairs:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) System.out.print(array[i] + " ");
        }
        System.out.println();


        System.out.println("impairs:");
        for (int v : array) {
            if (v % 2 != 0) System.out.print(v + " ");
        }



    }
}

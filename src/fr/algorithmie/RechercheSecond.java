package fr.algorithmie;
import java.util.Arrays;

public class RechercheSecond {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        Arrays.sort(array);
        int second_biggest=array[array.length-2];

        System.out.println("Second biggest element: "+ second_biggest);

    }
}


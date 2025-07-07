package fr.algorithmie;

import java.util.Arrays;

public class RechercheMax {
    public static void main(String[] args) {
      int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
      int max_in_array=array[0];

      for(int i: array){
       if (i>max_in_array)max_in_array=i;
      }
      System.out.println("Biggest number in array: "  + max_in_array);

    }
}

package fr.algorithmie;
import java.util.Arrays;
public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        double average=0;

        for(int i: array){
            average=i;
        }
        average=average/array.length;
        System.out.println("Average is "  + average);

    }
}

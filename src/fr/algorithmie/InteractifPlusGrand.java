package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in) ;

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print("Please enter number " +Integer.toString(i+1)+ " ");
            numbers[i] = scanner.nextInt();
        }
        int max_in_array=numbers[0];

        for(int i: numbers){
            if (i>max_in_array)max_in_array=i;
        }
        System.out.println("Biggest number is: "  + max_in_array);
    }
}

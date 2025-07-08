package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        for (int i = number+1; i <= number+10; i++) {

            if (i==number+10) System.out.print(i+".");
            else System.out.print(i+", ");
        }



    }

}

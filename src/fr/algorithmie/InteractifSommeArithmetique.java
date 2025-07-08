package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        System.out.print(sum);
    }
}

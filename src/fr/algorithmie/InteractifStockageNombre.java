package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[0];


        while (true) {
            System.out.println();
            System.out.println("Press 1 to add a number");
            System.out.println("Press 2 to list numbers");
            System.out.println("Press 3 to exit");
            int choise = scanner.nextInt();

            if (choise == 3) break;
            if (choise == 1) {
                System.out.println("Enter the number");
                int new_number = scanner.nextInt();
                numbers = java.util.Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] = new_number;

            }
            if (choise == 2) {
                System.out.println("Numbers in array");
                for (int i : numbers) {
                    System.out.println(i);

                }

            }


        }


    }
}

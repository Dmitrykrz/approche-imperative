package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fibonnaci number: ");

        int fib_number = scanner.nextInt();


        int fib_0 = 0;
        int fib_1 = 1;
        int desired_fib=0;

        if (fib_number==0) desired_fib=fib_0;
        if (fib_number==1) desired_fib=fib_1;
        if (fib_number>1) {
            for (int i = 1; i < fib_number; i++) {
                desired_fib = fib_0 + fib_1;
                fib_0 = fib_1;
                fib_1 = desired_fib;
            }

        }
        System.out.print(desired_fib);
    }
}

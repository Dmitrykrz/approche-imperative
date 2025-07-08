package fr.algorithmie;

import java.util.Scanner;

public class interactifTableMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Please enter number 1-10: ");
        int number = scanner.nextInt();
        while (number < 1 || number > 10) {
            System.out.print("Wrong number, try again ");
            number = scanner.nextInt();
        }

        for (int i = 1; i <=10 ; i++) {

            System.out.println( number+"*"+i+"="+number*i);
        }





    }

}

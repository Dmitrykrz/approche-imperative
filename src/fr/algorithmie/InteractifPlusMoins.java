
package fr.algorithmie;
import java.util.Scanner;
import java.util.Random;
public class InteractifPlusMoins  {
    public static void main(String[] args) {
        Random rnd = new Random();
        int secret_number = rnd.nextInt(101);
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Guess the secret number 0-100");
        int number_of_steps=0;
        while(true) {
            int number = scanner.nextInt();
            if (number < secret_number) System.out.println("No. Secret number is higher");
            else if (number > secret_number) System.out.println("No. Secret number is lower");
            else {
                System.out.println();
                System.out.println("You won!");
                System.out.println("It took you "+number_of_steps+" tries" );
                break;
            }
            number_of_steps++;
        }


    }

}

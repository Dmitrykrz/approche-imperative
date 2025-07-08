//It is impossbible to win if user goes first.
// To win computer must go first and user must pick (sticks + 3) % 4

package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Random rnd = new Random();
        int sticks = 21;
        boolean user_goes_first = rnd.nextBoolean();



        while (sticks > 0) {
            if (user_goes_first) {
                sticks -= user_turn(sticks);
                user_goes_first = false;
            }

            sticks -= pc_turn(sticks);

            if (sticks == 0) {
                System.out.println("You Win!");
                break;
            } else display(sticks);


            sticks -= user_turn(sticks);
            if (sticks == 0) System.out.println("You lose!");

        }

    }


    public static int user_turn(int sticks) {
        System.out.print("Your turn ");
        int user_pick = scanner.nextInt();

        while ((user_pick > 3) || (user_pick > sticks)) {
            System.out.println("You cannot pick that.");
            System.out.print("Your turn ");
            user_pick = scanner.nextInt();
        }


        return user_pick;
    }

    public static int pc_turn(int sticks) {
        Random rnd = new Random();
        int choise = (sticks + 3) % 4; // Computer wins !
        if (sticks == 1) choise = 1; // computer lose
        if (choise == 0) choise = rnd.nextInt(4); //Warning!
        // If this fires then computer is in trouble.
        // The only way out is to hope that user makes a mistake.
        // Take random number in hopes that he makes it.
        System.out.println("Computer takes " + choise);
        return choise;
    }

    public static void display(int sticks) {
        System.out.print(sticks + "    ");
        for (int i = 0; i < sticks; i++) {
            System.out.print("|");

        }
        System.out.println();
    }


}

package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 22; i++) {
            System.out.println("Dmitry");
        }

        System.out.println("Pairs");

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        System.out.println("Impairs");

        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

    }
}

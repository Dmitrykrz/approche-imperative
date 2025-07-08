package fr.algorithmie;

import java.util.Arrays;

public class NombreParfait {
    public static void main(String[] args) {
        int number =6;
        int perfection=0;

        for (int i = 1; i <= number/2; i++) {
            if (number%i==0)perfection+=i;
        }

        System.out.print("number: "+ number);
        if (number==perfection) {System.out.println(" Is perfect "); }
        else  {{System.out.println(" Is NOT perfect "); }}




    }
}

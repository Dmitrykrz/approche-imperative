package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        int number_of_common_elements=0;
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            for (int q = 0; q < Math.min(array1.length,array2.length); q++){
                if (array1[i]==array2[q]) number_of_common_elements++;

            }
        }
        System.out.println("Number of common elements "+ number_of_common_elements);



    }
}









package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String [] town_array = {"Paris", "London", "Montpellier","Nice","Berlin"};
        for (int i = 0; i < town_array.length; i++) {
            System.out.println(town_array[i]);
        }
        System.out.println( town_array.length);
        town_array[2]="Reims";
        for (int i = 0; i < town_array.length; i++) {
            System.out.println(town_array[i]);
        }

    }
}

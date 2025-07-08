package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {

        if (runtests()) System.out.println("All tests has passed !");
        else System.out.println("Function fabriquerMur does not work");

    }


    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int total=nbSmall*1+nbBig*5;
        int wall=0;
        for (int i = 0; i <= nbBig; i++) {
            for (int j = 0; j <= nbSmall; j++) {
                wall=5*i+j;
                //System.out.println(wall);
                if (wall==longueur) return true;
            }
        }
        return false;
    }



    public static boolean runtests() {
        int[][] test_data = {

               // Nombre de petites briques
               // Nombre de grandes briques
               // Longueur du mur
               //  1 ou 0, le mur peut-il être construit?
                {3, 1, 8, 1},
                {4, 2, 12, 1},
                {10, 0, 10, 1},
                {1, 2, 11, 1},
                {40, 40, 100, 1},
                {90, 90, 500, 1},
                {5, 7, 0, 1},
                {12, 3, 1, 1},
                {3, 2, 9, 0},
                {1, 4, 12, 0},
                {6, 7, 1000, 0},
                {1, 2, 9, 0},
        };


        for (int i = 0; i < test_data.length; i++) {
            boolean desired_resultat= test_data[i][3] == 1;
            boolean test_result=fabriquerMur(test_data[i][0],test_data[i][1],test_data[i][2]);
            if (test_result!=desired_resultat) return false;

        }
        
        return true;
        
    }







}

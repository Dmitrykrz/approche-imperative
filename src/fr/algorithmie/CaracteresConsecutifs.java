package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String s = "aaabbc";
        String resultat = "";

        for (int i = 0; i <s.length()-1; i++) {

            int repetition=1;

            if (s.charAt(i) == s.charAt(i+1)) {
                repetition++;
                for (int j = i+2; j <= s.length()-1; j++) {
                    if (s.charAt(i) == s.charAt(j)){
                    repetition++;
                    }
                    //Arrêtez d'aller plus loin si l'élément suivant est différent
                    else  break;
                }
            }
            resultat += s.charAt(i)+Integer.toString(repetition);
            //Faites avancer le compteur pour le nombre de répétitions. Plus besoin de les repasser.
            i=i+repetition-1;
        }

        //Ajouter l'élément final s'il n'est pas le même
        if (s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
            resultat += s.charAt(s.length()-1)+"1";
            System.out.println("lala");

        }
        System.out.println(resultat);

    }
}

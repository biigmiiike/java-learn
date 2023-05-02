public class HelloUniverse {
    public static void main(String... args) {
        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes=0;
        short annee=2021;
        if (annee<1600 || annee>2020){
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d",annee);
        }
        else if (annee>=1600 && annee<1700){
            nbPlanetes=7;
            System.out.printf(phraseIntroduction,annee,nbPlanetes);
        }
        else if (annee>=1700 && annee<1800 || annee>=2006){
            nbPlanetes=8;
            System.out.printf(phraseIntroduction,annee,nbPlanetes);
        }
        else {
            nbPlanetes=9;
            System.out.printf(phraseIntroduction,annee,nbPlanetes);
        }

    }
}
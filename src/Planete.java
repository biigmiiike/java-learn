public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    int rotation(int angleDeRotation){
        return angleDeRotation/360;
    }
    int revolution(int angleDeRotation){
        return angleDeRotation/360;
    }
    void acceuillirVaisseau(int nbHumain){
        totalVisiteurs=totalVisiteurs+nbHumain;
    }
    void acceuillirVaisseau(String typeVaisseau){
        if (typeVaisseau.equals("CHASSEUR")){
            totalVisiteurs=totalVisiteurs+3;
        }
        if (typeVaisseau.equals("FREGATE")){
            totalVisiteurs=totalVisiteurs+12;
        }
        if (typeVaisseau.equals("CROISEUR")){
            totalVisiteurs=totalVisiteurs+50;
        }

    }
}

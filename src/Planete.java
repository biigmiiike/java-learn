public class Planete {
    String nom;
    String matiere;
    long diametre;
    void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même. ",nom);
    }
    void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.",nom);
    }
}

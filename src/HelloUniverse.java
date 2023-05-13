public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";
        Planete planeteX = new Planete();

        System.out.printf("%s a effectué %d tours complets autour de son étoile.\n",neptune.nom,neptune.revolution(-3542));
        System.out.printf("%s a effectué %d tours complets sur elle-même.\n",mars.nom,mars.revolution(-684));
        System.out.printf("%s a effectué %d tours complets sur elle-même.\n",venus.nom,venus.revolution(1250));

        mars.acceuillirVaisseau(8);
        mars.acceuillirVaisseau("FREGATE");
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de %d.",mars.totalVisiteurs);
    }

}

package ab;

public class Joueur {
    int num;
    String nom;
    Pion pion;
    int score;

    public Joueur(String nom) {
        this.nom = nom;

    }

    public static void joueursInit(Joueur joueur, Joueur joueur2) { // Attribue automatiquement un pion X/Y aux
                                                                    // joueurs
        int random = (int) Math.round(Math.random() * (1));
        if (random == 0) {
            joueur.pion = Pion.X;
            joueur2.pion = Pion.Y;
            joueur.num = 1;
            joueur2.num = 2;

        } else {
            joueur.pion = Pion.Y;
            joueur2.pion = Pion.X;
            joueur.num = 2;
            joueur2.num = 1;
        }

    }
}
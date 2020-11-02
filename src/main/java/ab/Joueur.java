package ab;

public class Joueur {
    int num;
    String nom;
    Pion pion;
    int score;
    int isPlaying;

    public Joueur(String nom, int num) {
        this.nom = nom;
        this.num = num;
        if (this.num == 1) {
            this.pion = Pion.X;
            this.num = 1;

        } else {
            this.pion = Pion.O;
            this.num = 2;
        }

    }

}
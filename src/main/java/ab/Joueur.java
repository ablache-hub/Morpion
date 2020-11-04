package ab;

public class Joueur {
    private int num;
    private String nom;
    private Pion pion;
    private int score;

    public Joueur(String nom, int num) {
        this.nom = nom;
        this.num = num;
        this.score = 0;
        if (this.num == 1) {
            this.pion = Pion.X;
            this.num = 1;

        } else {
            this.pion = Pion.O;
            this.num = 2;
            this.score = 0;
        }

    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public Pion getPion() {
        return pion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
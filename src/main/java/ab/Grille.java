package ab;

public class Grille {
    private char[] getPlateau;

    public Grille() {
        this.getPlateau = new char[9];
    }

    public char getPlateau(int index) {
        return getPlateau[index];
    }

    public void setPlateau(int index, char symbole) {
        this.getPlateau[index - 1] = symbole;
    }

    // Remplissage de la grille avec numéros de cases puis affichage
    public void genererGrille() {
        for (int i = 0; i < this.getPlateau.length; i++) {
            this.getPlateau[i] = Character.forDigit(i + 1, 10);
        }

    }

    public void affichageGrille() { // Afficher la grille
        System.out.println("\n| " + this.getPlateau[0] + " | " + this.getPlateau[1] + " | " + this.getPlateau[2]
                + " |\n" + "|---|---|---|\n" + "| " + this.getPlateau[3] + " | " + this.getPlateau[4] + " | "
                + this.getPlateau[5] + " |\n" + "|---|---|---|\n" + "| " + this.getPlateau[6] + " | "
                + this.getPlateau[7] + " | " + this.getPlateau[8] + " |\n");

    }

}

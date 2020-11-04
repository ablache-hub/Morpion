package ab;

public class Grille {
    private char[] grille;

    public Grille() {
        this.grille = new char[9];
    }

    public char getPlateau(int index) {
        return grille[index];
    }

    public void setPlateau(int index, char symbole) {
        this.grille[index - 1] = symbole;
    }

    // Remplissage de la grille avec numéros de cases puis affichage
    public void genererGrille() {
        for (int i = 0; i < this.grille.length; i++) {
            this.grille[i] = Character.forDigit(i + 1, 10);
        }

    }

    public void affichageGrille() { // Afficher la grille
        System.out.println("\n| " + this.grille[0] + " | " + this.grille[1] + " | " + this.grille[2] + " |\n"
                + "|---|---|---|\n" + "| " + this.grille[3] + " | " + this.grille[4] + " | " + this.grille[5] + " |\n"
                + "|---|---|---|\n" + "| " + this.grille[6] + " | " + this.grille[7] + " | " + this.grille[8] + " |\n");

    }

}

package ab;

public class Grille {
    public char[] plateau;

    public Grille() {
        this.plateau = new char[9];
    }

    // Remplissage de la grille avec numéros de cases puis affichage
    public void genererGrille() {
        for (int i = 0; i < this.plateau.length; i++) {
            this.plateau[i] = Character.forDigit(i + 1, 10);
        }

    }

    public void affichageGrille() { // Afficher la grille
        System.out.println("\n| " + this.plateau[0] + " | " + this.plateau[1] + " | " + this.plateau[2] + " |\n"
                + "|---|---|---|\n" + "| " + this.plateau[3] + " | " + this.plateau[4] + " | " + this.plateau[5]
                + " |\n" + "|---|---|---|\n" + "| " + this.plateau[6] + " | " + this.plateau[7] + " | "
                + this.plateau[8] + " |\n");

    }

}

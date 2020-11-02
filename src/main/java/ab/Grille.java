package ab;

import java.util.Scanner;

public class Grille {
    public char[] plateau;
    Joueur joueur;

    public Grille() {
        this.plateau = new char[9];
    }

    // Remplissage de la grille avec numéros de cases puis affichage
    public void creerGrille() {
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

    public static void jouer(Joueur joueur1, Joueur joueur2, Grille grille) {
        Scanner in = new Scanner(System.in);
        int isPlaying = 1;
        boolean fini = false;

        do {
            if (joueur1.num == isPlaying) {
                System.out.println(joueur1.nom + " entrez un numéro de case à jouer (entre 1 et 9");
                while (!in.hasNext("[1-9]")) {
                    in.next();
                    System.out.println("Erreur, vous devez entrer un entier en 1 et 9");
                }

                grille.plateau[in.nextInt() - 1] = joueur1.pion.symbole;
                grille.affichageGrille();
                isPlaying = joueur2.num;

            } else {
                System.out.println(joueur2.nom + " entrez un numéro de case à jouer (entre 1 et 9");
                while (!in.hasNext("[1-9]")) {
                    in.next();
                    System.out.println("Erreur, vous devez entrer un entier en 1 et 9");
                }
                grille.plateau[in.nextInt() - 1] = joueur2.pion.symbole;
                grille.affichageGrille();
                isPlaying = joueur1.num;
            }
        } while (fini == false);
    }

}

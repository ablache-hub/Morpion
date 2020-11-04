package ab;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Partie {
    private Grille grille;
    private Scanner in = new Scanner(System.in);

    public Partie(Grille grille) {
        this.grille = grille;
    }

    // Scan si ligne de 3 remplie par l'un ou l'autre caractère
    private boolean verifLigne(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    // Scan les 8 lignes gagnantes possibles
    private boolean verifComplete() {
        if ((verifLigne(this.grille.getPlateau(0), this.grille.getPlateau(1), this.grille.getPlateau(2)))
                || verifLigne(this.grille.getPlateau(3), this.grille.getPlateau(4), this.grille.getPlateau(5))
                || verifLigne(this.grille.getPlateau(6), this.grille.getPlateau(7), this.grille.getPlateau(8))
                || verifLigne(this.grille.getPlateau(0), this.grille.getPlateau(3), this.grille.getPlateau(6))
                || verifLigne(this.grille.getPlateau(1), this.grille.getPlateau(4), this.grille.getPlateau(7))
                || verifLigne(this.grille.getPlateau(2), this.grille.getPlateau(5), this.grille.getPlateau(8))
                || verifLigne(this.grille.getPlateau(0), this.grille.getPlateau(4), this.grille.getPlateau(8))
                || verifLigne(this.grille.getPlateau(2), this.grille.getPlateau(4), this.grille.getPlateau(6))) {
            return true;
        } else
            return false;

    }

    // Pour le joueur en cours, scanner et vérifier l'input
    private int jouerCoup(Joueur joueur, int isPlaying) {
        System.out.println(joueur.getNom() + ", entrez un numéro de case à jouer (entre 1 et 9)");

        int input = in.nextInt();

        while ((input < 1) || (input > 9) || (this.grille.getPlateau(input - 1) == 'X')
                || (this.grille.getPlateau(input - 1) == 'O')) {
            System.out.println(
                    "Choix invalide, veuillez rejouer (le nombre doit être situé entre 1 et 9 et ne pas déjà avoir été joué)");

            input = in.nextInt();
        }

        // Inscrire input dans la grille puis changer de joueur
        grille.setPlateau(input, joueur.getPion().getSymbole());

        if (isPlaying == 1) {
            isPlaying = 2;
        } else {
            isPlaying = 1;
        }

        return isPlaying;

    }

    public void jouer(Joueur joueur1, Joueur joueur2) {
        // Selectionne joueur au hasard pour commencer
        int isPlaying = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int coups = 0;
        boolean gagne = false;
        String gagnant = "";

        do { // Tant que gagnant == false
            this.grille.affichageGrille();

            // Pour joueur en cours, jouer puis vérifier si une condition est remplie pour
            // gagner
            if (joueur1.getNum() == isPlaying) {
                isPlaying = jouerCoup(joueur1, isPlaying);
                coups += 1;
                joueur1.setScore(joueur1.getScore() + 1);

                if (verifComplete()) {
                    gagne = true;
                    grille.affichageGrille();
                    System.out
                            .println("Le joueur " + joueur1.getNom() + " a gagné en " + joueur1.getScore() + " coups");
                }

            } else {
                isPlaying = jouerCoup(joueur2, isPlaying);
                coups += 1;
                joueur2.setScore(joueur2.getScore() + 1);

                if (verifComplete()) {
                    gagne = true;
                    grille.affichageGrille();
                    System.out
                            .println("Le joueur " + joueur2.getNom() + " a gagné en " + joueur2.getScore() + " coups");
                }

            }
            // Si toutes les cases ont été jouées et aucune condition validée
            if (coups == 9 && gagnant.equals("")) {
                gagne = true;
                grille.affichageGrille();
                System.out.println("Match nul");
            }
        } while (gagne == false);
    }

}

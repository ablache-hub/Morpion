package ab;

import java.util.Scanner;

public class Partie {
    Grille grille;
    Joueur joueur;

    public Partie(Grille grille) {
        this.grille = grille;
    }

    // Pour le joueur en cours, scanner coup puis inscrire coup dans la grille,
    // changer de joueur
    public int jouerCoup(Joueur joueur, int isPlaying) {
        Scanner in = new Scanner(System.in);

        System.out.println(joueur.nom + ", entrez un numéro de case à jouer (entre 1 et 9)");
        while (!in.hasNext("[1-9]")) {
            in.next();
            System.out.println("Erreur, vous devez entrer un entier en 1 et 9)");
        }

        // int input = in.nextInt();

        this.grille.plateau[in.nextInt() - 1] = joueur.pion.symbole;
        if (isPlaying == 1) {
            isPlaying = 2;
        } else {
            isPlaying = 1;
        }

        return isPlaying;

    }

    public String jouer(Joueur joueur1, Joueur joueur2) {
        Scanner in = new Scanner(System.in);
        int isPlaying = 1;
        int coups = 0;
        boolean gagne = false;
        String gagnant = "";

        do {
            this.grille.affichageGrille();

            // Pour joueur en cours, jouer puis vérifier si une condition est remplie pour
            // gagner
            if (joueur1.num == isPlaying) {
                isPlaying = jouerCoup(joueur1, isPlaying);
                coups += 1;
                joueur1.score += 1;

                if ((verifVerti1(this.grille.plateau[0], this.grille.plateau[1], this.grille.plateau[2]))
                        || verifVerti2(this.grille.plateau[3], this.grille.plateau[4], this.grille.plateau[5])
                        || verifVerti3(this.grille.plateau[6], this.grille.plateau[7], this.grille.plateau[8])
                        || verifHori1(this.grille.plateau[0], this.grille.plateau[3], this.grille.plateau[6])
                        || verifHori2(this.grille.plateau[1], this.grille.plateau[4], this.grille.plateau[7])
                        || verifHori3(this.grille.plateau[2], this.grille.plateau[5], this.grille.plateau[8])
                        || verifDiag1(this.grille.plateau[0], this.grille.plateau[4], this.grille.plateau[8])
                        || verifDiag2(this.grille.plateau[2], this.grille.plateau[4], this.grille.plateau[6])) {
                    gagne = true;
                    gagnant = "Le joueur " + joueur1.nom + " a gagné en " + joueur1.score + " coups";
                }

            } else if (joueur2.num == isPlaying) {
                isPlaying = jouerCoup(joueur2, isPlaying);
                coups += 1;
                joueur2.score += 1;

                if ((verifVerti1(this.grille.plateau[0], this.grille.plateau[1], this.grille.plateau[2]))
                        || verifVerti2(this.grille.plateau[3], this.grille.plateau[4], this.grille.plateau[5])
                        || verifVerti3(this.grille.plateau[6], this.grille.plateau[7], this.grille.plateau[8])
                        || verifHori1(this.grille.plateau[0], this.grille.plateau[3], this.grille.plateau[6])
                        || verifHori2(this.grille.plateau[1], this.grille.plateau[4], this.grille.plateau[7])
                        || verifHori3(this.grille.plateau[2], this.grille.plateau[5], this.grille.plateau[8])
                        || verifDiag1(this.grille.plateau[0], this.grille.plateau[4], this.grille.plateau[8])
                        || verifDiag2(this.grille.plateau[2], this.grille.plateau[4], this.grille.plateau[6])) {
                    gagne = true;
                    gagnant = "Le gagnant est " + joueur2.nom;
                }

            }
            // Si toutes les cases ont été jouées et aucune condition validée
            if (coups == 9 && gagnant.equals("")) {
                gagne = true;
                gagnant = "Match nul";
            }
        } while (gagne == false);
        return gagnant;
    }

    public boolean verifVerti1(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifVerti2(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifVerti3(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifHori1(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifHori2(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifHori3(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifDiag1(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }

    public boolean verifDiag2(char a, char b, char c) {
        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            return true;
        } else
            return false;
    }
}

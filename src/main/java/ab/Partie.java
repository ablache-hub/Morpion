package ab;

import java.util.Scanner;

public class Partie {
    Grille grille;
    Joueur joueur;

    public Partie(Grille grille) {
        this.grille = grille;
    }

    public void jouer(Joueur joueur1, Joueur joueur2) {
        Scanner in = new Scanner(System.in);
        int isPlaying = 1;
        boolean fini = false;

        do {
            this.grille.affichageGrille();
            if (joueur1.num == isPlaying) {
                System.out.println(joueur1.nom + " entrez un numéro de case à jouer (entre 1 et 9)");
                while (!in.hasNext("[1-9]")) {
                    in.next();
                    System.out.println("Erreur, vous devez entrer un entier en 1 et 9)");
                }

                this.grille.plateau[in.nextInt() - 1] = joueur1.pion.symbole;
                this.grille.affichageGrille();
                isPlaying = joueur2.num;

                fini = verifVerti1(this.grille.plateau[0], this.grille.plateau[1], this.grille.plateau[2]);
                System.out.println("Le gagnant est: " + joueur1.nom);

            } else {
                System.out.println(joueur2.nom + " entrez un numéro de case à jouer (entre 1 et 9");
                while (!in.hasNext("[1-9]")) {
                    in.next();
                    System.out.println("Erreur, vous devez entrer un entier en 1 et 9");
                }
                this.grille.plateau[in.nextInt() - 1] = joueur2.pion.symbole;
                this.grille.affichageGrille();
                isPlaying = joueur1.num;

                fini = verifVerti1(this.grille.plateau[0], this.grille.plateau[1], this.grille.plateau[2]);
                System.out.println("Le gagnant est: " + joueur2.nom);

            }
        } while (fini == false);
    }

    public int coupJoueur(Joueur joueur, int isPlaying) {
        Scanner in = new Scanner(System.in);

        System.out.println(this.joueur.nom + " entrez un numéro de case à jouer (entre 1 et 9)");
        while (!in.hasNext("[1-9]")) {
            in.next();
            System.out.println("Erreur, vous devez entrer un entier en 1 et 9)");
        }

        this.grille.plateau[in.nextInt() - 1] = this.joueur.pion.symbole;
        this.grille.affichageGrille();
        if (isPlaying == 1)
            isPlaying = 2;
        else
            isPlaying = 1;
        ;

        return isPlaying;

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

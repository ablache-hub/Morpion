package ab;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Grille grille = new Grille();
        grille.genererGrille();
        Partie partie = new Partie(grille);

        System.out.println("Entrez nom du premier joueur:");
        Joueur joueur1 = new Joueur(in.nextLine(), 1);
        System.out.println("Entrez nom du second joueur:");
        Joueur joueur2 = new Joueur(in.nextLine(), 2);

        System.out.println(partie.jouer(joueur1, joueur2));
        grille.affichageGrille();

    }

}

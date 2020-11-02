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

        Grille grille = new Grille();
        grille.creerGrille();

        Scanner in = new Scanner(System.in);
        System.out.println("Entrez nom du premier joueur:");
        Joueur joueur1 = new Joueur(in.nextLine());
        System.out.println("Entrez nom du second joueur:");
        Joueur joueur2 = new Joueur(in.nextLine());
        Joueur.joueursInit(joueur1, joueur2);

        grille.affichageGrille();

        Grille.jouer(joueur1, joueur2, grille);
        System.out.println(joueur1.pion.symbole);
        grille.affichageGrille();
    }

}

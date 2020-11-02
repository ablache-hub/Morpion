package ab;

public class Pion {
    char symbole;
    int emplacement;

    public Pion(char symbole) {
        this.symbole = symbole;
    }

    static Pion X = new Pion('X');
    static Pion O = new Pion('O');
}

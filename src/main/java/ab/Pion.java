package ab;

public class Pion {
    private char symbole;

    public Pion(char symbole) {
        this.symbole = symbole;
    }

    static Pion X = new Pion('X');
    static Pion O = new Pion('O');

    public char getSymbole() {
        return symbole;
    }

}

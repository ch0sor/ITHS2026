class Djur {
    // Field som lagrar djurets ljud
    String ljud;

    // Konstruktor som tar emot ljudet
    Djur(String ljud) {
        this.ljud = ljud;
    }

    // Metod som skriver ut djurets ljud
    void gorLjud() {
        System.out.println(ljud);
    }
}

public class Main41 {
    public static void main(String[] args) {

        // Skapar en hund och ger den ljudet "Voff!"
        Djur hund = new Djur("Voff!");

        // Skapar en katt och ger den ljudet "Mjau!"
        Djur katt = new Djur("Mjau!");

        // Djuren gör sina ljud
        hund.gorLjud();
        katt.gorLjud();
    }
}
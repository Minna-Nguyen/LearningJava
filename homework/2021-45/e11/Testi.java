abstract class Nisakas {

    public void synnyta() {
        System.out.println("Synnytan lapsen");
    }
}

class Koira extends Nisakas {

}

class Testi {
    public static void main (String [] args) {
        // Nisakas testi = new Nisakas (); // sovellus ei käänny, koska Nisakas-luokka on absrakti eli sitä ei voi luoda oliota
        Koira koira = new Koira();
        koira.synnyta();
        
    }
}
abstract class Nisakas {

    public void synnyta() {
        System.out.println("Synnytan lapsen");
    }
}

class Koira extends Nisakas {

    public void nuuhkiPyllya() {
        System.out.println("Nuuhkii toisen koiran pyllya");
    }
}

class Ihminen extends Nisakas {
    
    public void luoTaidetta() {
        System.out.println("Luo taidetta");
    }
}

class Testi {
    public static void main (String [] args) {
        // Nisakas testi = new Nisakas (); // sovellus ei käänny, koska Nisakas-luokka on absrakti eli sitä ei voi luoda oliota
        Koira koira = new Koira();
        System.out.println("Koira: ");
        koira.synnyta();
        System.out.println("Koira: ");
        koira.nuuhkiPyllya();
        System.out.println();
        Ihminen ihminen = new Ihminen();
        System.out.println("Ihminen: ");
        ihminen.luoTaidetta();

    }
}
abstract class Nisakas {

    abstract void aantelehdi();

    public void synnyta() {
        System.out.println("Synnytan lapsen");
    }
}

class Koira extends Nisakas {
    public void aantelehdi(){
        System.out.println("hau hau");
    }

    public void nuuhkiPyllya() {
        System.out.println("Nuuhkii toisen koiran pyllya");
    }
}

class Ihminen extends Nisakas {
    public void aantelehdi(){
        System.out.println("moOi");
    }

    public void luoTaidetta() {
        System.out.println("Luo taidetta");
    }
}

class Testi {
    public static void main(String [] args) {
        Koira koira = new Koira();
        Ihminen ihminen = new Ihminen();

        metodi(koira);
        metodi(ihminen);
    }

   
    public static void metodi(Nisakas a) {
        // a.nuuhkiPyllya(); // ei onnistu tulostaminen-> ei ole abstraktista metodia ja löytyy vain Koiralta
        // a.luoTaidetta();  // ei onnistu tulostaminen ->ei ole abstraktista metodia ja löytyy vain Ihmiselta
        a.aantelehdi();   // Toimii, Koira-luokalla ja Ihminen-luokalla on pakolliset metodit eli samat abstrakti metodit.
    }
}
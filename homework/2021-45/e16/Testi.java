interface MyytavaAsia {
   public void myy();
}

class Energiajuoma implements MyytavaAsia {
    public void myy() {
        System.out.println("energiajuoma myyty");
    }
}

abstract class Nisakas {

    abstract void aantelehdi();

    public void synnyta() {
        System.out.println("Synnytan lapsen");
    }
}

class Koira extends Nisakas implements MyytavaAsia {
    public void aantelehdi(){
        System.out.println("hau hau");
    }

    public void nuuhkiPyllya() {
        System.out.println("Nuuhkii toisen koiran pyllya");
    }

    public void myy() {
        System.out.println("koira myyty");
    }
}

class Testi {
    public static void main (String [] args) {
        Energiajuoma juoma = new Energiajuoma();
        Koira koira = new Koira();

        juoma.myy();
        koira.myy();
    }
}
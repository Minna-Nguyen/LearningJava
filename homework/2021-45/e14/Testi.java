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

        method1(koira);
        method2(ihminen);
        // method3(Nisakas);
        method4("moi");
    }
    public static void method1(Koira a) {
        a.nuuhkiPyllya();
    }
    public static void method2(Ihminen a) {
    a.luoTaidetta();
    }
    public static void method3(Nisakas a) {
        //Nisakas on abstrakti luokka, ei voida luoda oliota tästä
    }
    public static void method4(Object a) {
        System.out.println(a);
    }
}
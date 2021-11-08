

class Ihminen {
    public void nuku(){
        System.out.println("Ihminen nukkuu");
    }

    public void syo(){
        System.out.println("Ihminen syo");
    }

    public void juo(){
        System.out.println("Ihminen juo");
    }
    
    public void lisaanny(){
        System.out.println("Ihminen lisaantyy");
    }
}

class Ohjelmoija extends Ihminen {

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println("Osallistuu Cyber Goth Dance juhlaan");
    }

    public void ohjelmoi() {
        System.out.println("ohjelmoija ohjelmoi");
    }
}

public class Testi {
   public static void main (String [] args) {

    Ihminen ada = new Ihminen();
    Ihminen david = new Ihminen();
    Ihminen davida = new Ihminen();
    Ohjelmoija newbie = new Ohjelmoija();

    ada.nuku();
    david.syo();
    davida.juo();
    david.lisaanny();
   
    System.out.println("\n----");
   
    newbie.nuku();
    newbie.syo();
    newbie.juo();
    newbie.lisaanny();
    newbie.ohjelmoi();
    newbie.osallistuCyberGothDanceJuhlaan();
    } 
}

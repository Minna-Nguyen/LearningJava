

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

public class Testi {
   public static void main (String [] args) {

    Ihminen ada = new Ihminen();
    Ihminen david = new Ihminen();
    Ihminen davida = new Ihminen();

    ada.nuku();
    david.syo();
    davida.juo();
    david.lisaanny();
    } 
}

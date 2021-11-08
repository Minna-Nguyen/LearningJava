

class Ihminen {
    private String nimi;

    public void setName(String n) {
        nimi = n;
    }

    public String getName(){
        return nimi;
    }

    public void nuku(){
        System.out.println(this.nimi + " nukkuu");
    }

    public void syo(){
        System.out.println(this.nimi + " syo");
    }

    public void juo(){
        System.out.println(this.nimi + " juo");
    }
    
    public void lisaanny(){
        System.out.println(this.nimi + " lisaantyy");
    }
}

class Ohjelmoija extends Ihminen {
   

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println(getName() + " osallistuu Cyber Goth Dance juhlaan");
    }

    public void ohjelmoi() {
        System.out.println(getName() + " ohjelmoija ohjelmoi");
    
    }

    
}

public class Testi {
   public static void main (String [] args) {

    Ihminen ada = new Ihminen();
    Ihminen david = new Ihminen();
    Ihminen davida = new Ihminen();
    Ohjelmoija felix = new Ohjelmoija();

    ada.setName("Ada");
    david.setName("David");
    davida.setName("Davida");
    felix.setName("Felix");
    ada.nuku();
    davida.syo();
    

    System.out.println("\n----");
   
    felix.nuku();
    felix.syo();
    felix.juo();
    felix.lisaanny();
    felix.ohjelmoi();
    felix.osallistuCyberGothDanceJuhlaan();
    } 
}

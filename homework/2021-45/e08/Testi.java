

class Ihminen {
    private String nimi;

    public Ihminen(String nimi) {
        if(nimi.length()>0){
         setNimi(nimi);   
        }else{
            IllegalArgumentException e = new IllegalArgumentException ("Nimen oltava enemman kuin 0 merkkia");
            throw e;
        }
    }

    public void tulostaTiedot() {
        System.out.println(this.nimi);
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getName() {
        return nimi;
    }

    public void nuku() {
        System.out.println(this.nimi + " nukkuu");
    }

    public void syo() {
        System.out.println(this.nimi + " syo");
    }

    public void juo() {
        System.out.println(this.nimi + " juo");
    }
    
    public void lisaanny() {
        System.out.println(this.nimi + " lisaantyy");
    }
}

class Ohjelmoija extends Ihminen {

    private int palkka;

     public Ohjelmoija(String nimi, int p) {
        super(nimi);  // Ihminen(String nimi);
        setPalkka(p);
    }

    public void tulostaTiedot() {
        super.tulostaTiedot();
        System.out.println(this.getName()+ " " + this.getPalkka());
    }

    public void setPalkka(int p) {
        if(p>1000 && p<10000){
        palkka = p;
        }else{
            IllegalArgumentException e = new IllegalArgumentException("Palkan oltava 1000 - 10 000 valilta");
             throw e;
        }
    }
   
    public int getPalkka() {
        return palkka;
    }

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println(getName() + " osallistuu Cyber Goth Dance juhlaan");
    }

    public void ohjelmoi() {
        System.out.println(getName() + " ohjelmoija ohjelmoi");
    
    }

    
}

public class Testi {
   public static void main (String [] args) {

    Ihminen ada = new Ihminen("Ada");
    Ihminen david = new Ihminen("David");
    Ihminen davida = new Ihminen("Davida");
    Ohjelmoija felix = new Ohjelmoija("Felix", 2500);
    Ohjelmoija bangchan = new Ohjelmoija("Bangchan", 3540);

    ada.nuku();
    davida.syo();
    

    System.out.println("\n----");
   
    felix.nuku();
    felix.syo();
    felix.juo();
    felix.lisaanny();
    bangchan.ohjelmoi();
    bangchan.osallistuCyberGothDanceJuhlaan();
    System.out.println("\n----");

    bangchan.tulostaTiedot();
    felix.tulostaTiedot();
    } 
}



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
        System.out.println(getName() + " osallistuu Cyber Goth Dance juhliin");
        this.lisaanny();

    }

    public void ohjelmoi() {
        System.out.println(getName() + " ohjelmoija ohjelmoi");
    }

    public void lisaanny() {
        super.tulostaTiedot();
        if(this.getPalkka() > 5000){
            System.out.println("Ohjelmoija lisaantyy");
        }else{
            System.out.println("Ohjelmoija yrittaa lisaantya");
        }
    }
    
}

public class Testi {
   public static void main (String [] args) {

    Ihminen ada = new Ihminen("Ada");
   
    Ohjelmoija felix = new Ohjelmoija("Felix", 5500);
    Ohjelmoija bangchan = new Ohjelmoija("Bangchan", 3540);

    System.out.println("\n----");
    bangchan.osallistuCyberGothDanceJuhlaan();
    System.out.println("\n---");
    felix.osallistuCyberGothDanceJuhlaan();

    } 
}

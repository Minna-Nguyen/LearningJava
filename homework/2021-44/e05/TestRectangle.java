

class Rectangle {   
   public int width;
   public int height;
        
    public void printMe() {
        System.out.println(width);
        System.out.println(height);

    }

    public void whoAmI() {
        System.out.println(this);
    }

    public void finalize() {
        System.out.println("Deleting: " + this);
    }
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 3;
        
        // Rectangle p = new Rectangle();
        // System.out.println(p);
        // p = null;
        // kaynnistaRoskienKeruu(); 
        
            //poistaa nyt p-olion  --> finalize metodi toimii, miksi?
            // STACKissa oli olion muistipaikka tallennut jota nyt poistettiin. HEAPissa oleva tieto leijuu, 
            // eikä siihen ole mtn STACKin puolelta viitaamassa. Tämän takia poistuu

            // STACK       HEAP
            // p 0x01 ---> TIETOA {x,y}

            // p olio nyt tyhjäarvoksi
            // p null     TIETOA -> DELETED, koska mikään Stackissa ei viittaa tähän!


        Rectangle p1 = new Rectangle();
        Rectangle p2 = p1;
        System.out.println(p1);
        p1 = null;
        kaynnistaRoskienKeruu(); 
        // nyt roskien keruu ei onnistu... ei tule finalize metodi!
        //p2 on tallennettu p1-olion muistipaikka ja siten viittaa vielä tohon TIETOOn. Tietoa ei siis poisteta
    }

    public static void kaynnistaRoskienKeruu() {
        // Käynnistetään roskien keruu.
        System.gc();
        // Odotellaan sekunnin verran.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
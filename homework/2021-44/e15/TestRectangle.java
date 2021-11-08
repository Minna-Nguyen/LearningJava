

class Rectangle {   
   private int width;
   private int height;
        
    //main-metodista arvot näihin parametreihin    
    public Rectangle(int w, int h){
        //siirretään vastaavat arvot niiden set - metodeihin
        setWidth(w);
        setHeight(h);
    }

    public void setWidth (int w) {
        if(w > 0){
            width = w;
        }else{
            IllegalArgumentException e = new IllegalArgumentException("Anna positiivisia lukuja plz");
             throw e;
        }
    }

    public int getWidth () {
        return width;
    }

    public void setHeight (int h) {
        if(h > 0){
            height = h;
        }else{
            IllegalArgumentException e = new IllegalArgumentException("Anna positiivisia lukuja plz");
             throw e;
        }
    }

    public int getHeight () {
        return height;
    }

    public String toString() {
        return "Suorakulmion leveys on "+ this.width + " ja korkeus on " + this.height;
    }

    public Rectangle cloneMe() {
        return new Rectangle(this.width, this.height);
    }

    
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle r1 = new Rectangle(24,55);
        Rectangle r2 = r1.cloneMe();

        //kattoo onko sama kuvio (width ja height)
        if(r1.equals(r2)){
            System.out.println("On sama korkeus ja levyes " + "\n" + r1.toString() + "\n" + r2.toString());
        }else{
            System.out.println("Ei ole sama korkeus ja levyes");
        }
        
        //r1 ja r2 sisältävät eri muistipaikan osoitteet.
        if(r1 != r2) {
            System.out.println("Eri muistipaikka");
        }else{
            System.out.println("Sama muistipaikka!");
        }
    }
}

// tietokoneen muistissa nyt kaksi oliota, r1 ja r2.
// r1 ja r2 sisältävät eri muistipaikan osoitteet.
// if(r1 != r2) {
//     System.out.println("different memory addresses");
// }

// if(r1.equals(r2)) {
//     System.out.println("The same width and height");
// }
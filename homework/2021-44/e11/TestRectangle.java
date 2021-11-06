

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
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect1 = new Rectangle(24,55);
        Rectangle rect2 = new Rectangle(24,55);

        //vertaillaan kahta suorakaidetta
        //Eivat vertaile, koska = merkki! Pitaa kayttaa equals!
        if(rect1 == rect2) {
            System.out.println("Samat suorakaiteet!");
        }
        
    }
}
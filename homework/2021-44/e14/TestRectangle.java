

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

    public double countDiagonal() {
        return this.width*this.width + this.height*this.height;
    }

    
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle r1 = new Rectangle(24,55);
        Rectangle r2 = new Rectangle(12,5);

        System.out.println("R1 lavistaja on " +r1.countDiagonal());
        System.out.println("R2 lavistaja on " +r2.countDiagonal());
    }
}
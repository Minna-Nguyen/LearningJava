

class Rectangle {   
   private int width;
   private int height;
        
    public void setWidth (int w) {
        if(w > 0){
            width = w;
        }else{
            System.out.println("Anna positiivinen luku!");
            System.out.println("Tulos on 0, ei onnistu");
        }
    }

    public int getWidth () {
        return width;
    }

    public void setHeight (int h) {
        if(h > 0){
            height = h;
        }else{
            System.out.println("Anna positiivinen luku!");
            System.out.println("Tulos on 0, ei onnistu");

        }
    }

    public int getHeight () {
        return height;
    }
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(20);
        System.out.println("Leveys on " + rect.getWidth());
        rect.setHeight(12);
        System.out.println("Korkeus on " + rect.getHeight());

    }
}
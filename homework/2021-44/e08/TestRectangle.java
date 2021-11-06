

class Rectangle {   
   private int width;
   private int height;
        
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
        Rectangle rect = new Rectangle();
        rect.setWidth(20);
        System.out.println("Leveys on " + rect.getWidth());
        rect.setHeight(112);
        System.out.println("Korkeus on " + rect.getHeight());


        try {
        rect.setWidth(-9);
        } catch(IllegalArgumentException e) {
        System.out.println("Testataan antaa vaaraa arvoa:");
        System.out.println("NOPE! " + e.getMessage());
        }

    }
}
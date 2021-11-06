

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
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        // rect.printMe();
        rect.width = 5;
        rect.height = 3;
        rect.whoAmI(); // tulostaa nyt muistipaikan, kun mitään attribuuttia ei annettu this jutulle
    }
}
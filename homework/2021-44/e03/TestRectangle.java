

class Rectangle {   
   public int width;
   public  int height;
        
    public void printMe() {
        System.out.println(width);
        System.out.println(height);

    }
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        rect.width = 3;
        rect.height = 5;
        rect.printMe();
    }
}
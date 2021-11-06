

class Rectangle {
    // tietoa, muuttujia, attribuutteja:
    public int width;  // = 0 oletusarvo
    public int height;      // = 0 oletusarvo
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        // Rectangle rect1 = rect;

        rect.width = 3;
        rect.height = 5;
        Rectangle rect1 = rect;

        System.out.println(rect1.width);
        System.out.println(rect1.height);
    }
}

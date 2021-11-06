
class Rectangle {
    // tietoa, muuttujia, attribuutteja:
    public int width;  // = 0 oletusarvo
    public int height;      // = 0 oletusarvo
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();

        //tulostaa width ja height arvolla 0, joka on siis oletusarvo
        System.out.println(rect.width);
        System.out.println(rect.height);

    }
}
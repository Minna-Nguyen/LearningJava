import java.io.Console;

class Rectangle {   
   private int width;
   private int height;

    public Rectangle(int w, int h){
        setWidth(w);
        setHeight(h);
    }
        
    public void setWidth (int w) {
        if(w >= 0){
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
        if(h >= 0){
            height = h;
        }else{
          IllegalArgumentException e = new IllegalArgumentException("Anna positiivisia lukuja plz");
             throw e;

        }
    }

    public int getHeight () {
        return height;
    }
    
    public int countSurfaceArea() {
        int area = this.width * this.height;
        return area;
    }
}

class TestRectangle {
    public static void main(String [] args) {
        Console c = System.console();

        Rectangle [] talletus = new Rectangle [10];
        int summa = 0;

    for(int i = 0; i<10; i++){
        System.out.println("Anna leveys ja korkeus nro. " + (i+1));
        talletus [i]= new Rectangle(Integer.parseInt(c.readLine()), Integer.parseInt(c.readLine()));
        summa = summa + talletus[i].countSurfaceArea();
    }
        System.out.println("Kaikkien suorakulmien kokonaissumma on " + summa);

    }
}
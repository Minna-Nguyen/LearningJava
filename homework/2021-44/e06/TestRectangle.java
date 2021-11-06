

class Rectangle {   
   public int width;
   public int height;
        

    //ei palauta, kutsutaan main-metodista! Printtailut tänne    
    public void printMe() {
        System.out.println(width);
        System.out.println(height);
    }

    //palauttava metodi, main-metodissa tulostus
    public int countSurfaceArea() {
        int area = this.width * this.height;
        return area;
    }
}

class TestRectangle {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 3;
        
        System.out.println("Kuvion pinta-ala on " + rect.countSurfaceArea());
    }
}

class Main {
    public static void main(String [] args) {
        Bird lintu = new Bird();
        //esittele luokka metodissa ensin, ja sitten luo olio
        class Struthioniformes extends Bird {
            @Override
            public void lenna() {
                System.out.println("strutsi yrittaa lentaa");
            }     
        }


        Struthioniformes s = new Struthioniformes();
        lintu.lenna();

        
        s.lenna();

    
    }
       


    public static void lenna(Bird b) {
        b.lenna();
    }
}


class Bird {
    public void lenna() {
        System.out.println("lintu lentaa");
    }
}

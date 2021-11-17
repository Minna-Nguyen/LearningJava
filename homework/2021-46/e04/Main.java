
class Bird {
    public void lenna() {
        System.out.println("lintu lentaa");
    }
}

class Main {
    public static void main(String [] args) {
        Bird lintu = new Bird();
        lintu.lenna();
   
        //esittele luokka metodissa ensin, ja sitten luo olio
        class Struthioniformes extends Bird {
            @Override
            public void lenna() {
                System.out.println("strutsi yrittaa lentaa");
            }     
        }
        Struthioniformes s = new Struthioniformes();
        s.lenna();
        
        //tapa 1
        Bird x = new Bird() {
            @Override
            public void lenna() {
                System.out.println("Anonyymi lentaa");
            }
        };
                x.lenna();
        //tapa 2
        lenna(new Bird() {
            public void lenna() {
                System.out.println("Anonyymi lentaa");
            }
        });
    }


    public static void lenna(Bird b) {
        b.lenna();
    }
}

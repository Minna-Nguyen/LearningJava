
interface  MyytavaTuote {
    public void myy();
}

class Main {
    public static void main(String [] args) {
        class EnergiaJuoma implements MyytavaTuote {
            public void myy() {
                System.out.println("energiajuoma myyty");
            }
        }
        EnergiaJuoma ed = new EnergiaJuoma();
        myy(ed);
        
        class Koira implements MyytavaTuote {
            public void myy() {
                System.out.println("koira myyty");
            }
        }
        Koira spot = new Koira();
        myy(spot);

        //tapa1
        MyytavaTuote x = new MyytavaTuote() {
        @Override
        public void myy() {
            System.out.println("anonyymi myyty");
        }
    };
        myy(x);

       // tapa2 ilman x muuttujan esittelyä
        myy(new MyytavaTuote() {
            public void myy() {
                System.out.println("anonyymi myyty");
            }
        });
    }
    public static void myy(MyytavaTuote m) {
        m.myy();
    }
}
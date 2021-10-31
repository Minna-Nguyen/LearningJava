
public class Main {
    public static void main(String [] args) {
        int random = (int) (Math.random()*10);

        int [] kone = new int[4];
        for (int i = 0; i<4; i++){
            System.out.println("tayta " + kone[i]);
            kone[i] = random;
        }

    }
}

//ensin kaanna sovellus
//sitten java Main JOTAIN TAHAN
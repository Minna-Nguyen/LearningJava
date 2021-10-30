import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna jokin luku");
        int ekaluku = Integer.parseInt(c.readLine());
        System.out.println("Anna toinen luku");
        int tokaluku = Integer.parseInt(c.readLine());

        System.out.println("---");
        erisuuret(ekaluku, tokaluku);
    }

    public static void erisuuret (int ekaluku, int tokaluku){
        if(ekaluku > tokaluku) {
            System.out.println("1.lukusi on " + ekaluku+ "\n" + "2.lukusi on " + tokaluku+ "\n---");
            System.out.println("Tulostetaan niiden valilta");
            for(int i = ekaluku; i >= tokaluku; i--) {
               System.out.println(i);
            }
         }else{
            System.out.println("1.lukusi on " + ekaluku+ "\n" + "2.lukusi on " + tokaluku + "\n---");
            System.out.println("Tulostetaan niiden valilta");
            for(int i = ekaluku; i <= tokaluku; i++) {
               System.out.println(i);
            }
        }
    }
}
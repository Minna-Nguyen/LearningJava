import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna jokin luku");
        int UserInput = Integer.parseInt(c.readLine());
        System.out.println("---");

        int luku = UserInput; //esim 3 --> 1 + 2 + 3 = 6
        int summa = 0;
            for(int i = 1; i<=luku; i++){
            summa = summa + i;
        }
    System.out.println("Antamasi luvun summa olisi: " + summa);
    }
}
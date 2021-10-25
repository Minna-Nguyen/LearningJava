
import java.io.Console;  

public class summa {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());
        System.out.println(" ");

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());
        System.out.println(" ");
        
        int summa = luku + luku2;
        System.out.println("Summasi on: ");
        System.out.println("...");
        System.out.println(summa);

        }

}
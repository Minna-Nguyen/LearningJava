
import java.io.Console;  

public class suurempiHEI {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());
        System.out.println();

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());
        System.out.println();
        
        if (luku>luku2){
        System.out.println("Suurempilukusi on:");
        System.out.println(luku);
        System.out.println("...");
        System.out.println("hellurei");
    }else{
        System.out.println("Suurempilukusi on:");
        System.out.println("...");
        System.out.println(luku2);
        System.out.println("hellurei");
        }
    }
}
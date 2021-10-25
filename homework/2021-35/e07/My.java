
import java.io.Console;  

public class My {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());
        System.out.println(" ");

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());
        System.out.println(" ");
        
        if (luku>luku2){
        System.out.println("Suurempi lukusi on");
        System.out.println(luku);
        }
        else{
        System.out.println("Suurempi lukusi on");
        System.out.println(luku2);
         }

        }

}
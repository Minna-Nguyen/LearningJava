
import java.io.Console;  

public class hellurei10 {
    public static void main(String [] args) {
        Console c = System.console(); 
        System.out.println("Anna luku");
        
        int luku = Integer.parseInt(c.readLine());
        System.out.println("...");
        
        int count = 0;

        while (count<luku){
        System.out.println("hellurei");
        count++;
        }
    }
}

        




import java.io.Console;  

public class age {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Kuinka vanha olet?");
        int luku = Integer.parseInt(c.readLine());
        System.out.println(" ");

        
        if (luku<25) {
        System.out.println("Oletpas nuori");
        }
        else{
        System.out.println("Oletpas vanha");
         }
    }
}
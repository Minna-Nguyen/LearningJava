import java.io.Console;

public class Kuka4{
    public static void main(String [] args) {

        Console c = System.console();
        System.out.println("Mika on nimesi?");
        String nimi = c.readLine();
        System.out.println();

        for(int i =nimi.length() - 1; i>=0; i--){
       
    
        System.out.println(nimi.charAt(i));
        }       
        System.out.println();

    }
}
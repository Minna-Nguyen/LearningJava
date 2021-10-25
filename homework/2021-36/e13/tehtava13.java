import java.io.Console;

public class tehtava13 {
    public static void main (String [] args){
        Console c = System.console();        
        
        System.out.println("Kuvion ruksien maara?");
        int luku = Integer.parseInt(c.readLine());

        for(int maara = 0; maara<luku; maara++){
        System.out.print("X");

        }
    }
}
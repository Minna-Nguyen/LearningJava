import java.io.Console;


public class tehtava5 {
    public static void main(String [] args){
        Console c = System.console(); 

        System.out.println("Anna ensimmainen kokonaisluku");
        int luku1 = Integer.parseInt(c.readLine());
        System.out.println("Anna toinen kokonaisluku");
        int luku2 = Integer.parseInt(c.readLine());

        double tulos1 = (double) luku1/luku2;
        double tulos2 = luku1 /(double)luku2;
        System.out.println("Tuloksesi on " + tulos1);

        
    }
}
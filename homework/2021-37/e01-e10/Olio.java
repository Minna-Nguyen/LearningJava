import java.io.Console;

public class Olio{
    public static void main(String [] args) {

        /*Console c = System.console();
        System.out.println("Sano jotain");
        String jotain = c.readLine(); */
        String testi = "  Alynvalays  ";
        System.out.println(testi); 
        System.out.println();
        System.out.println("Hmm... kirjain tassa kohtaa on "+testi.charAt(2));
        /*printtaa merkin kohdassa 2 --> 01234... jne vastaavat merkit*/

        //lenght() testaus
        System.out.println();
        System.out.println("Tassa kertoo merkkien maaran eli "+testi.length());

        //Trim() testaus
        System.out.println();
        System.out.println("tyhjat valilyonnit pois eli "+testi.trim());
    
    }
}
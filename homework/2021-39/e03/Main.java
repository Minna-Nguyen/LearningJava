import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna nimi:");
        String nimi = c.readLine();
    // sijoittaa annetun nimen tohon metodiin ja kutsuu ton metodin koodin toimii?      
        tulostaJokinNimi(nimi);
    }
    public static void tulostaJokinNimi(String nimi) {
        //tulostaa täällä sen annetun nimen
        System.out.println("Nimesi on "+nimi);
    }
}
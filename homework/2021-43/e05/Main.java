import java.io.Console;

public class Main{
    public static void main(String [] args){
        Console c = System.console();
        System.out.println("Anna nimi");
        String name  = c.readLine();

        while (name.length() < 2){
        System.out.println("Anna nimi");
        name = c.readLine();
        }
        System.out.println("\n---" + "\n" + "Annoit nimen " + name);
    }
}

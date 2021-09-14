import java.io.Console;

public class OnkoJussi{
    public static void main(String [] args) {

        Console c = System.console();
        System.out.println("Mika on nimesi?");
        String nimi = c.readLine();
        System.out.println();

        if(nimi.equalsIgnoreCase("Jussi")){
            System.out.println("Onpas sulla tyhma nimi");
        }else {
            System.out.println("Onpas sulla hieno nimi");
        }

    }
}
import java.io.Console;

public class Kuka{
    public static void main(String [] args) {

        Console c = System.console();
        System.out.println("Mika on nimesi?");
        String nimi = c.readLine();
        System.out.println();

        for(int i =0; nimi.length()>i; i++) 
        /*alkaa nollasta ja loppuu oman nimen 
        merkkien pituuden verran asti! 
        Esim MINNA = merkkipituus on 5. Printtaus alkaa nollasta 
        ja loppuu viidenteen merkkiin!*/
    
        System.out.println(nimi.charAt(i));
       
        System.out.println();

    }
}
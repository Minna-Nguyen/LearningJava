import java.io.Console;

public class hyvaajoulua {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("anna paiva");
        int day = Integer.parseInt(c.readLine());
        System.out.println("anna kuukausi(numero)");
        int month = Integer.parseInt(c.readLine());

        // jos day on 24 JA (&&) month on 12, tulosta hyvää joulua
        //   kun vertailet yhtäsuuruutta, käytä kahta = merkkiä! if(day == 24 ..)
 
 if(day == 24 && month == 12){
     System.out.println("Hyvaa joulua");
 } else {
     System.out.println("nyt ei ole joulu");
        }

    }
}
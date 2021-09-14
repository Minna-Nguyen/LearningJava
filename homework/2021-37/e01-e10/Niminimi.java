import java.io.Console;

public class Niminimi{
    public static void main(String [] args) {
        Console c = System.console();
        



        String nimi = " "; 
        /* Väliaikainen muistietappi 
        myöhempää muutosta varten*/
    
    if(!(nimi.equalsIgnoreCase("lopeta"))){ 
        System.out.println("Anna nimi");
        nimi = c.readLine();
        System.out.println(nimi); 
        /*tässä kohtaa printtaa ekan annettavan nimen*/
    }
        String nimi2 = " "; 
    while(!((nimi2.equalsIgnoreCase("lopeta")))){
        System.out.println("Anna nimi. TIP: kirjoita lopeta, jos haluat lopettaa");
        nimi2 = c.readLine(); /*aluksi nimi2 = " ", mutta se korvataan 
        käyttäjän antamalla nimellä*/
        
        nimi = nimi + nimi2; /*ensimmäinen nimi on nyt eka nimi + uusi nimi, 
        ja se tallentuu tohon nimeen*/
        System.out.println(nimi);
    } 
    /*while-silmukka mahdollistaa sen, että kaikki nimet tulevat yhdelle riville. 
    Siis ymmärräks, se monistaa itteensä ja lisää uuden nimen*/
    
    }
}
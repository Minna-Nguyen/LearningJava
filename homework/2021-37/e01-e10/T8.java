import java.io.Console;

public class T8{
    public static void main(String [] args) {

    
        Console c = System.console();
        System.out.println("Anna jokin merkkijono");
        String jono = c.readLine();
        System.out.println("Merkkijonosi on " +jono);
   
        
    /* Palindromi on sana joka on etuperin ja takaperin samannäköienn 
    esim RADAR = RADAR*/

    /* RADAR --> ensimmäinen ja viimeinen on sama
    toinen ja toiseksi viimeinen on sama jne. 

                    RADAR
                    01234 --> 0 ja 4, 1 ja 3
                    */       
    

        /*for(int i=0; jono.length()>i; i++)
        System.out.print(jono.charAt(i));*/
        String taka = "";
        int eteen = jono.length();

        for(int i = eteen- 1; i>=0; i--){
            taka = taka + jono.charAt(i);
        }

        if(jono.equals(taka)){
            System.out.println("On palindromi!");
        }else{
            System.out.println("Ei ole palindromi");
        }
    }
}


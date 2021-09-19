import java.io.Console;

public class T9{
    public static void main(String [] args) {

    
        Console c = System.console();
        System.out.println("Anna jokin merkkijono");
        String jono = c.readLine();
        System.out.println("Merkkijonosi on " +jono);
   
        String str =""; /*Alla oleva for-loop määrittelee jonon ilman 
        välilyöntei- ja merkkei edestäpäin*/
    
        for(int a=0; jono.length()>a; a++){
           if(jono.charAt(a)!=' '
           && jono.charAt(a)!=','
           && jono.charAt(a)!='.'){
               str = str + jono.charAt(a); /*tähän on tallentunut yksittäiset
                merkit vaihe vaiheelta? */ 
           }
        }
      
        /*Alla oleva määrittelee jonon takaapäin ilman välimerkkejä ja -lyöntei */      
        int eteen = jono.length();  /*huomaa että ei ole String vaan int eli luku*/
        String str2 ="";
        String taka = "";
        for(int i = eteen- 1; i>=0; i--){
           taka = taka + jono.charAt(i);
           if(jono.charAt(i)!=' '
           && jono.charAt(i)!=','
           && jono.charAt(i)!='.'){
               str2 = str2 + jono.charAt(i);
           }
        }
        
        if(str.equalsIgnoreCase(str2)){
            System.out.println("On palindromi!");
        }else{
            System.out.println("Ei ole palindromi");
        }
    }
}
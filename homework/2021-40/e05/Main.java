import java.io.Console;

public class Main{
    public static void main (String [] args) {
        Console c = System.console();
        System.out.println("Anna ensimmainen merkkijono: ");
        String a = c.readLine();
        System.out.println("Anna toinen merkkijono: ");
        String b = c.readLine();
        System.out.println(StringHelper.equals(a,b));
    }
}

class StringHelper{
    public static boolean equals(String a, String b) {
        int pituus = a.length();
        int pituustoinen = b.length();
        String eka = "";
        String toka= "";


        for(int i = 0; i<pituus; i++){
            eka = eka + a.charAt(i);
        }

        for(int j = 0; j<pituustoinen; j++){
            toka = toka + b.charAt(j);
        }


        if(eka.equals(toka)){
            return true;
        }else{
            return false;
        }
        
    }
}
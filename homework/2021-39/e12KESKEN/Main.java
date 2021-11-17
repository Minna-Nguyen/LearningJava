import java.io.Console;


public class Main {
    public static void main (String [] args) {

        Console c = System.console();
        System.out.println("Anna jokin sana");
        String sana = c.readLine();
        System.out.println("Sana on palindromi: " + isPalindrome(str, false));
    }

    static String str ="";

    public static boolean isPalindrome(String sana, boolean includeWhiteSpaces) {
        int eteen = sana.length();
        String takaperin ="";
        
        for(int i = eteen- 1; i>=0; i--){
            takaperin = takaperin + sana.charAt(i); //tarkastellaan sana takaperin kirjain kerrallaan
        }
        

        //vertailu onko palindromi vai ei
        if(str.equals(takaperin)){
            return true;
        }
        else{
            return false;
        }

    }
}
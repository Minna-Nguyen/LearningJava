
/**
* Luokka Main sisaltaa printStars-metodin, jota kutsutaan main metodista. Tulostetaan kuvio.
* @author Minna
*/
import java.io.Console;

public class Main{
    public static void main (String []args){
        Console c = System.console();
        System.out.println("Anna jokin luku");
        int input = Integer.parseInt(c.readLine());
        printStars(input);
    }
    /** 
    * Tassa metodissa tulostetaan kuvio kayttajan antaman kokonaisluvun verran. Metodi kutsutaan main-metodista
    * @param amount main-metodista kayttajan antama luku. Kuvio * tulostetaan luvun verran
    * 
    * @author Minna 
    */
    public static void printStars(int amount){
   
        for(int i = 0; i<amount; i++){
        System.out.print('*');
        }
    }
}
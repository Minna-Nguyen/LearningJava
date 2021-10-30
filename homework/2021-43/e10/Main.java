/**
* Luokka Main sisaltaa printText-metodin, jota kutsutaan main metodista
* @author Minna
*/
import java.io.Console;

public class Main{
    public static void main (String []args){
        Console c = System.console();
        System.out.println("Anna jokin luku");
        int input = Integer.parseInt(c.readLine());
        printText(input);
    }
    /** 
    * Tassa metodissa tulostetaan nimi kaytajan antaman kokonaisluvun verran. Metodi kutsutaan main-metodista
    * @param number main-metodista kayttajan antama luku. Nimi tulostetaan luvun verran
    * 
    * @author Minna 
    */
    public static void printText(int number){
   
        for(int i = 0; i<number; i++){
        System.out.println("Hei Minna!");
        }
    }
}
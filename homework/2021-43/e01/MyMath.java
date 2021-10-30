import java.io.Console;

/** 
*Luokka sisaltaa Main-luokan, jossa toteutetaan isPositive luokka.
*@author Minna 
*/

public class MyMath {
    public static void main (String [] args){

   }
    /** 
    * Palauttaa boolean arvon. 
    * Jos luku on negatiivinen palauttaa false
    *
    * Jos luku on positiivinen palauttaa true
    *
    * @param number kayttajan antama luku
    * @return true or false (boolean)
    * @author Minna 
    */
    public static boolean isPositive(int number){
      
        if(number >0){
            return true;
        }else{
            return false;
        }
    }
}
    /**
    *Toteutetaan IsPositive metodi
    */
class Main{
    public static void main (String [] args){
    System.out.println("Anna luku");
        Console c = System.console();
        int number = Integer.parseInt(c.readLine());

        System.out.println(MyMath.isPositive(number));

    }
}

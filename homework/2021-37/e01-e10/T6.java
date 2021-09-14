import java.io.Console;

public class T6{
    public static void main(String [] args) {

        int a = 1;
        int b = 2;

        System.out.println("Tulos on "+ (a+b));
        /*muuttujat ovat kokonaislukuja, 
        suorittaa yhteenlaskun --> 1 + 2 = 3*/
        System.out.println(); 
        
        String c = "merkkijono1";
        String d = "merkkijono2";
        System.out.println("Tulos on "+ (c+d));
        /*tulostavat peräkkäin --> ei tule yhteenlaskua*/
        System.out.println(); 

        System.out.println("Tulos on "+ (c+b));
        /* tulostaa merkkijonon perään luvun, ei tule yhteenlaskua*/

        double e = 3.3;
        System.out.println(); 
        System.out.println("Tulos on "+ (c+e));
        /* tulostaa merkkijonon perään luvun, ei tule yhteenlaskua*/
        System.out.println(); 
        System.out.println("Tulos on "+ (e+c+e));
        /* tulostaa merkkijonon perään luvun, ei tule yhteenlaskua*/
        System.out.println(); 
        System.out.println("Tulos on "+ (b+d));
        /* tulostaa merkkijonon perään luvun, ei tule yhteenlaskua. 
        Niin kauan kun on jtn merkkiä, se tulee merkkijonoksi*/

        char f = 'a';
        char g = 'b';

        System.out.println(); 
        System.out.println("Tulos on "+ (c+f));
        /* tulostaa merkkijonon perään luvun, ei tule yhteenlaskua. 
        Niin kauan kun on jtn merkkiä, se tulee merkkijonoksi*/
        System.out.println(); 
        System.out.println("Tulos on "+ (f+g));
        /*merkit mahdollistavat yhteenlaskun 
        koska ovat samaa tyyppiä. Ööh niillä on 
        */


    }
}
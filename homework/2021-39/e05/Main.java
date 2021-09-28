import java.io.Console;

public class Main{
    public static void main (String [] args){
        Console c = System.console();
        //kysytään käyttäjältä kaksi lukua
        System.out.println("Anna 1. luku:");
        int a = Integer.parseInt(c.readLine());
        System.out.println("Anna 2. luku:");
        int b = Integer.parseInt(c.readLine());
        
        //siirretään käyttäjän antamat luvut laske-metodiin
        //siellä suoritetaan lasku
        //tulos palautetaan tänne kutsumalla metodia
        System.out.println("Summasi: "+laske(a,b));
    }
    public static int laske(int a, int b){
        return a + b;
    }
}
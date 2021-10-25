import java.io.Console;

public class Alepub {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Paljonko kello on(h)?");
        int h = Integer.parseInt(c.readLine());
        System.out.println("Paljonko kello on(min))");
        int min = Integer.parseInt(c.readLine());
        System.out.println("Paljonko rahaa sinulla on?");
        int raha = Integer.parseInt(c.readLine());


        //yksinkertaisempi, mene alepubiin jos rahaa >= 5
        // ja kello on 20 - 23 (minuuteilla ei  tehdä tässä ratkaisussa mitään)
        boolean timeOk = (h>=19 && h <=23);

    if(raha >= 5 && timeOk){
        System.out.println("Alepub on auki klo 19 - 23 joka paiva ja oluen hinta on 5 euroa. Mene Alepubiin.");
    }else{
        System.out.println("... Ei viela pubiin!");
    }

        }

    }
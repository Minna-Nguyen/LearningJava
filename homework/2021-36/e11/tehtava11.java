import java.io.Console;


public class tehtava11 {
    public static void main (String [] args){
        Console c = System.console();

        int luku = 0;
do{
        System.out.println("Anna luku");
        luku = Integer.parseInt(c.readLine());
}while(luku>7||luku<1);

switch(luku){
    case 1: System.out.println("Maanantai"); break;
    case 2: System.out.println("Tiistai"); break;
    case 3: System.out.println("Keskiviikko"); break;
    case 4: System.out.println("Torstai"); break;
    case 5: System.out.println("Perjantai"); break;
    case 6: System.out.println("Lauantai"); break;
    case 7: System.out.println("Sunnuntai"); break;
}

    }
}

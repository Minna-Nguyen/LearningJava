import java.io.Console;


public class tehtava10 {
    public static void main (String [] args){
        Console c = System.console();

        int luku = 0;
do{
        System.out.println("Anna luku");
        luku = Integer.parseInt(c.readLine());
}while(luku>7|| luku<1);

    System.out.println("Hyva, numerosi on 1-7 valilla");
    }
}
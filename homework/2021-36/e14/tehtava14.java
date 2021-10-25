import java.io.Console;

public class tehtava14{
    public static void main (String [] args){
        Console c = System.console();
        System.out.println("Kuvion korkeus?");
        int korkeus = Integer.parseInt(c.readLine());


        /*tulostaa x merkkiä rivin verran*/
        for(int rivi=0; rivi<korkeus; rivi++){
            for(int i =0; i<korkeus; i++){
                System.out.print("X");
                /* tulostaa x merkkiä korkeuden verran*/
            }
            System.out.println();

            /*vaihtaa riviä, ei tule kaikki putkeen? */
        }




    }
}
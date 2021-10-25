import java.io.Console;

public class tehtava16{
    public static void main (String [] args){
        Console c = System.console();
        System.out.println("Kuvion korkeus?");
        int korkeus = Integer.parseInt(c.readLine());

        /* 0 1 2 3 4 5 rivillä x määrä
           1 x 
           2 - x  
           3 - - x 
           4 - - - x 
           5 - - - - x 
           6 - - - - - x 
        
        1-6 = korkeus?

        */
    
        /*tulostaa x merkkiä rivin verran*/
        for(int rivi=0; rivi<korkeus; rivi++)/*x korkeus*/{
            for(int i=0; i<korkeus; i++) /*x näärä yhdellä rivillä*/
            {if(rivi==i){
        System.out.print("X");
        }else {
        System.out.print(" ");
        }
            }
        System.out.println();
          /*vaihtaa riviä, ei tule kaikki putkeen? */
        }
    }
}
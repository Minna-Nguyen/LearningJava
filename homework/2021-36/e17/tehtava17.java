import java.io.Console;

public class tehtava17{
    public static void main (String [] args){
        Console c = System.console();
        System.out.println("Kuvion korkeus?");
        int korkeus = Integer.parseInt(c.readLine());

        for(int rivi=korkeus-1; rivi>=0; rivi--)/*x korkeus*/{
            for(int i=0; i<=korkeus; i++) /*x näärä yhdellä rivillä*/
            {if(rivi==i){
        System.out.print("X");
        }else {
        System.out.print(" ");
        }
            }
        System.out.println();
        }
    }
}
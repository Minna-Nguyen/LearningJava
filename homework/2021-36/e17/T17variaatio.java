import java.io.Console;

public class T17variaatio{
    public static void main (String [] args){
        Console c = System.console();
        System.out.println("Kuvion korkeus?");
        int korkeus = Integer.parseInt(c.readLine());

   
        for(int rivi=0; rivi<=korkeus; rivi++)/*x korkeus*/{
            for(int i=0; i<=korkeus-rivi; i++) /*x näärä yhdellä rivillä*/
            {if(rivi>=i){
        System.out.print(" ");
        }else {
        System.out.print("X");
        }
        System.out.print("-");

            }
        System.out.println();
        }
    }
}
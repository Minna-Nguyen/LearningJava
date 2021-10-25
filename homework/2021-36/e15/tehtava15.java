  import java.io.Console;

public class tehtava15{
    public static void main (String [] args){
        Console c = System.console();
        System.out.println("Kuvion korkeus?");
        int korkeus = Integer.parseInt(c.readLine());

     
  
for(int rivi=0; rivi<korkeus; rivi++)/*x korkeus*/   
   {if(rivi==0 || rivi==korkeus-1){  
        for(int i=0; i<korkeus; i++)
        System.out.print("X"); /*x näärä yhdellä rivillä*/
        }else{ 
           System.out.print("X");

        for(int j=1; j<korkeus-1; j++)

       if(rivi==j){
           System.out.print("X");
       }else{
           System.out.print(" ");
       }
           System.out.print("X");

}    
       System.out.println();
    }
}
}  /*holy moly HOW did I do THIS??*/
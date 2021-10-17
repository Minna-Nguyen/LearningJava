import java.io.Console;

public class Main {
    public static  void main (String [] args) {
        Console c = System.console();

        int [][] luvut = new int [2][2];
        
        for(int i = 0; i<luvut.length; i++){
            for(int j = 0; j<luvut[i].length; j++){
            System.out.println("Anna luku");
            luvut[i][j] = Integer.parseInt(c.readLine()); //tallennetaan annetut luvut taulukkoihin
            }
            System.out.println();
        }
            System.out.println("Taulukoissa on: ");
            for(int i = 0; i<luvut.length; i++){
            for(int j = 0; j<luvut[i].length; j++)
            System.out.println(luvut[i][j]);
            System.out.println();
        }
    }
}
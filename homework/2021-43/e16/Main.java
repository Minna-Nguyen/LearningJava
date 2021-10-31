import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console() ;

        System.out.println("Taulukon koko? ");
        int size = Integer.parseInt(c.readLine());
        int taulukko [] = new int [size];
        System.out.println("---");

            for(int i = 0; i<taulukko.length; i++){
                System.out.println("Tayta taulukkosi " + (i+1) + "." + "arvo");
                taulukko[i] = Integer.parseInt(c.readLine());
            }
        System.out.println();
            int summa = 0;
            for(int j = 0; j< taulukko.length; j++){
                summa += taulukko[j];
            }
            double average = ((double) summa )/ taulukko.length;

            System.out.println("Antamiesi arvojen keskiarvo on " +average);
        
    }
}
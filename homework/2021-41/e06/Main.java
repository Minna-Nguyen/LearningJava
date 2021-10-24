import java.io.Console;

public class Main {
    
    static Console c = System.console();
        public static  void main (String [] args) {
            
            System.out.println("Taulukon koko: ");
            int size = Integer.parseInt(c.readLine());
            System.out.println("Sarakkeita: ");
            int column = Integer.parseInt(c.readLine());
            System.out.println();

            int [][] myarray = new int [size][column];
                printTwoDimArray(myarray);
    }
        public static void printTwoDimArray(int [][] myarray) {
            for (int i = 0; i < myarray.length; i++) {
                System.out.println("Taulukko "+ (i+1));
            //täytetään sisataulukot
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.println("Taytetaan taulukon sarakkeet: ");
                myarray[i][j] = Integer.parseInt(c.readLine());
            }
                System.out.println();
        }
    }
}
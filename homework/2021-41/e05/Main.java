
public class Main {
    public static  void main (String [] args) {
           int [][] myarray = { {12,33,1},
                                {0,14,2} };
            printTwoDimArray(myarray);
        }
    public static void printTwoDimArray(int [][] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.println(myarray[i][j]);
            }
            System.out.println();
        }

    }
}
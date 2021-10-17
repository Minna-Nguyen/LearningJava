

public class Main {
    public static  void main (String [] args) {
        int [][] luvut = {{1,3,9}, {2,7,3}};
        for(int i = 0; i<luvut.length; i++){
            for(int j = 0; j<luvut[i].length; j++)
            System.out.print(luvut[i][j]);
            System.out.println();
        }
    }
}
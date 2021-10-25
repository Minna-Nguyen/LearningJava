import java.io.Console;

public class Main {
    static Console c = System.console();
    //static int size;
    public static void main (String [] args){
        System.out.println("Kuvion korkeus?");
        int size = Integer.parseInt(c.readLine());

        char [][] print = new char [size][size];
        kuvio(print);
    }
    public static void kuvio(char[][] merkit){
        int koko = merkit.length;
        for(int i = 0; i<=koko-1; i++){
            for(int j = 0; j<koko; j++){
                if(i == 0 || i == koko -1 || j == 0 || j == koko -1){
                    merkit[i][j] = 'x';
                }else{
                    merkit[i][j] = ' ' ;
            }
//            merkit[i][j] = 'x';
        System.out.print(merkit[i][j]);
            }
        System.out.println();
        }
    }
}
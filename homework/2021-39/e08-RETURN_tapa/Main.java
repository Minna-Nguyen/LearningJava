import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Kuvion korkeus:");
        int korkeus = Integer.parseInt(c.readLine());
        for (int i = 0; i<korkeus; i++){
        System.out.println(kuvio('O', korkeus));    
        }
    }
    public static String kuvio(char merkki, int korkeus){
        String rivi = "";
        for(int i = 0; i<korkeus; i++){
            rivi = rivi + merkki;
        }
    return rivi;
    }
}

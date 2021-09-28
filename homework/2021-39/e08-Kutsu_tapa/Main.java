import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Kuvion korkeus:");
        int korkeus = Integer.parseInt(c.readLine());
        
        kuvio('o', korkeus);
    }
    public static void kuvio(char merkki, int korkeus){
        String rivi = "";
        for(int i = 0; i<korkeus; i++){
            rivi = rivi + merkki;
        }
        for(int j = 0; j<korkeus; j++){
                System.out.println(rivi);
            }

    }
}

import java.util.Scanner;

public class ExtraOikeaVastaus {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 1;
        int suurin = 0;
        while(luku > 0){
            System.out.println("Anna positiivinen luku(negatiivinen lopettaa): ");
            luku = lukija.nextInt();

            if(luku > suurin){
                suurin = luku;
            }

        }
        System.out.println("Suurin luku oli: " + suurin);
    }
}
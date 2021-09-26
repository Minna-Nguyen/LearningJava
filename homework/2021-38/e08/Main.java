import java.io.Console;

class Main{
    public static void main (String [] args){

        //kysytään käyttäjältä luku//
        Console c = System.console();
        
        int [] taulukko = new int[10]; /*laskuri alkaa nollasta eli 0123456789 = 10 kpl*/
        for(int i=0; taulukko.length-1>=i; i++){
        System.out.println("Anna " + (i+1) + ". " + "numero");
        int luku = Integer.parseInt(c.readLine());
        taulukko[i] = luku; /*käyttäjän antamat luvut tallennetaan nyt taulukkoon*/
        
        int summa = 0;
        for(int j = 0; j<=taulukko.length-1; j++){ /*tässä käydään läpi jokainen taulukon jäsen yksi kerrallaan 0.jäsen -> 9.jäsen = 10 kpl*/
        summa = summa + taulukko[j]; /* 0 plus taulukon ensimmäinen luku(taulukon jäsen alkaa 0.jäsenellä)*/
        }        
        System.out.println("tulos " +summa);

        }
    }
}
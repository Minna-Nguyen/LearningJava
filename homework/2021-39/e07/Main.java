
public class Main{
    public static void main (String [] args){
        int maara = 5;
        System.out.println(kuvio('O', maara));
    }
    public static String kuvio(char merkki, int maara){
        //siirettiin main-metodissa oleva int maara
        //tämän argumentin int maaraan, jolloin alla oleva
        //for-loop lähtee käyntiin
        //tulostaa merkin verran mitä luvuksi annettiin
        
        String rivi = ""; /*tässä kohtaa printataaan niitä merkkejä, 
        mutta palauttaen  main-metodiin */
        for(int i = 0; i<maara; i++){
        rivi = rivi + merkki;
        }
        return rivi; /* rivi on merkki ja se on määrän verran*/
    }
}
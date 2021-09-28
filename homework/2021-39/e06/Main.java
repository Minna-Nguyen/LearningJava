
public class Main{
    public static void main (String [] args){
        int maara = 7;
        //
        kuvio('X', maara);
    }
    public static void kuvio(char merkki, int maara){
        //siirettiin main-metodissa oleva int maara
        //tämän argumentin int maaraan, jolloin alla oleva
        //for-loop lähtee käyntiin
        //tulostaa merkin verran mitä luvuksi annettiin
        for(int i = 0; i<maara; i++){
            System.out.print(merkki);
        }
    }
}
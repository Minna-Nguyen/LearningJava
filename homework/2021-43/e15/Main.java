import java.io.Console ;

public class Main {
    public static void main(String [] args) {
        Console c = System.console() ;

        System.out.println("Anna jokin sana");
        String sana = c.readLine();
        if(sana.length()<=4){
            System.out.println("Sanasi merkkimaara ei ole yli 4.");
        }else{
        System.out.println("Sanasi loppuosa on: " + split(sana,4));
        }
    }

    public static String split(String user, int pituus){
        //katkaistaan sana kohdalta 4
        String cut = "";
        String oikeinPain = "";
        //otetaan 4 viimeista kirjainta, ovat takaperin
        for(int i=user.length()-1; i>=(user.length()-pituus); i--){
            if(!(user.charAt(i)==4 && user.charAt(i) == 0)){
                cut = cut  + user.charAt(i);
            }
        }
        //kaannetaan sana oikeinpain
        for(int j = cut.length()-1; j>=0; j--){
            oikeinPain = oikeinPain + cut.charAt(j);
        }
            return oikeinPain;
    }
}
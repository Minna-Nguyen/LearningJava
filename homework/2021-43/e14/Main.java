import java.io.Console ;

public class Main {
    public static void main(String [] args) {
        Console c = System.console() ;

        System.out.println("Anna jokin sana");
        String sana = c.readLine();
        if(sana.length()<4){
            System.out.println("Sanasi merkkimaara on alle 4.");
        }else{
        System.out.println("Sanasi alkuosa on: " + split(sana,4));
        }
    }

    public static String split(String user, int pituus){
        //katkaistaan sana kohdalta 4
        String cut = "";
        for(int i=0; i<pituus; i++){
            cut = cut  + user.charAt(i);
        }
            return cut;
        }
    }

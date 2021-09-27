

public class Main{
    public static void main (String [] args){
        String [] taulukko = {"kivi", "sakset", "paperi"};
        int random = (int)(Math.random()*3);
        /* tai näinkin voi tehdä --> int i = (int)random;*/
        System.out.println("Tulostetaan satunnaisesti kivi, sakset tai paperi.");
        System.out.println("Satunnainen tulos: "+taulukko[random]);     
    }
}
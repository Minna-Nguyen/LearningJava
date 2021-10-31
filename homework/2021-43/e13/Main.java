import java.io.Console ;

/**
* Luokka Main sisaltaa find-metodin, joka palauttaa main-metodiin true tai false kertoen 
* sisaltyyko kayttajan antama arvo taulukossa
* @author Minna
*/


public class Main {
    public static void main(String [] args) {
        Console c = System.console() ;
        int [] array = {1,65,3,7,78};

        System.out.println("Anna jokin luku");
        int value = Integer.parseInt(c.readLine());

        if(find(array, value) == true){
        System.out.println("Lukusi on taulukosa: " +find(array, value));
        }else{
        System.out.println("Lukusi ei ole taulukosa: " +find(array, value));
        }
    }
    /** 
    * Tassa metodissa vertaillaan kayttajan antama lukuarvo ja taulukossa olevia arvoja.
    * 
    * @param array taulukossa erilaisia lukuarvoja
    * @param value kayttajan antama lukuarvo
    * @return palautetaan true jos lukuarvo loytyy taulukosta. Vastaavasti palautetaan false, jos lukuaro ei loydy taulukosta
    * @author Minna 
    */
    public static boolean find(int [] array, int value) {
        
        for(int i=0; i<array.length; i++){
            if(value==(array[i])) {
                return true ;
            }
        } 
        return false;
    }
}
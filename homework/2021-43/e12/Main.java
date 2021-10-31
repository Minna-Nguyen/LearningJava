import java.io.Console;
/**
* Luokka Main sisaltaa printRectangle-metodin, jota kutsutaan main metodista. 
* Tulostetaan suorakulmion metodin parametrien perusteella.
* @author Minna
*/
public class Main{
    public static void main (String []args){
        Console c = System.console();
        System.out.println("Kuvion leveys?"); //sarakkeita yhdella rivilla
        int input = Integer.parseInt(c.readLine());
        System.out.println("Kuvion korkeus?"); //riveja
        int input2 = Integer.parseInt(c.readLine());
        printRectangle(input, input2);
    }
    /** 
    * Tassa metodissa tulostetaan kuvio kayttajan antamien tietojen perusteella. Metodi kutsutaan main-metodista
    * @param width kertoo kuinka monta * saraketta
    * @param heigth kertoo kuinka monta * rivilla
    * 
    * @author Minna 
    */
    public static void printRectangle(int width, int heigth){
        
         for (int i = 0; i <= heigth-1; i++) {
            for (int j = 0; j <= width-1; j++) {
                System.out.print("o");
            }
            System.out.println();
         }
    }
}
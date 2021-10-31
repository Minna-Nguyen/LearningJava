

import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        //System.out.println("Anna luku koko");
        //int UserInput = Integer.parseInt(c.readLine());
        System.out.println("---");

       // int [] talletus = new int [UserInput];
        int summa = 0;

                System.out.println("anna arvoja, negativiinen lopettaa");
                
        summa = summa + Integer.parseInt(c.readLine()) + UserInput;
        System.out.println("summas  " + summa);
        // System.out.println("anna arvoja, negativiinen lopettaa");
        // summa = summa + Integer.parseInt(c.readLine()) + UserInput;
        // System.out.println("summas  " + summa);
        
    
        // System.out.println("summas  " + summa);

            
        
        // for(int i = 0; i<talletus.length; i++){
        //     System.out.println("Anna jokin luku. Negatiivinen lopettaa.");
        //     talletus[i] = Integer.parseInt(c.readLine());
        //     System.out.println("taulukossa " + talletus[i]);
        // }

        // for(int i=0; i<talletus.length; i++){
        //     summa = summa + talletus[i];
        // }

        // double keskiarvo = ((double) summa) / talletus.length;
        // System.out.println("keskiarvosi " + keskiarvo);

    }
}

// Toteuta sovellus joka kysyy käyttäjältä positiivisia kokonaislukuja. 
// Lukujen lukeminen lopetetaan kun käyttäjä antaa negatiivisen luvun.
// Ohjelma tulostaa annettujen lukujen keskiarvon.
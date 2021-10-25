

public class tehtava8 {
    public static void main (String [] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        
        System.out.println("...");
        System.out.println("...");
        System.out.println("Seuraava osio");

       int j = 5;
        do{
            System.out.println(j);
            j++;
        }while(j<=15);  
        
        System.out.println("...");
        System.out.println("...");
        System.out.println("Seuraava osio");

        int k = 10;
        do{
            System.out.println(k);
            k--;
        }while (k>=0);
        
        System.out.println("...");
        System.out.println("...");
        System.out.println("Seuraava osio");

        int l = 10;
        do{
            System.out.println(l);
            l = l -2;
        }while (l>=0);

        System.out.println("...");
        System.out.println("...");
        System.out.println("DoWhile testi");

int x = 20;
        while(x < 1) {
            System.out.println("A");
        }

        do {
            System.out.println("B");
        } while(x < 1);


        // While-loopissa meilla on ehto, joka on epatosi 
        //---> toistoja voi olla 0 - ääretön krt 
        //Do-while loopissa toistoja voi olla 1 - ääretön krt
        //kuten ylemmassa esimerkissa nahdaan, ohjelma printtaa B-kirjaimen
        //vaikka ehto on epatosi

    }
}
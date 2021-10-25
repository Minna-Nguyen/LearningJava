import java.io.Console;

public class tehtava9 {
    public static void main(String [] args){
        Console c = System.console();

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());
        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());


        
       // int tulo = 0;
       // while(tulo = tulo + luku2) {
        
        //tulo = tulo + luku2;  // tulo = 0 + 5
        //tulo = tulo + luku2;  // tulo = 5 + 10 ..

        //System.out.println(tulo);
        //n * m = m + m + m .. (m-kertaa)
        //2 * 4 = 2+2+2+2
    //} 


    if (luku < 0){
    luku = -(luku);
}
    int summa = 0;

    for (int i =0; i <luku; i++){
    summa += luku2; // sama asia kuin summa = summa +luku2;
    }
    
    System.out.println("tulos on " + summa);
    }

}
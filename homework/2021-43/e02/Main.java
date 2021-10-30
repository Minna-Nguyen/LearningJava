import java.io.Console;

public class Main{
    public static void main(String [] args){
        Console c = System.console();
        System.out.println("Anna 1. luku");
        int UserNumber1  = Integer.parseInt(c.readLine());
        System.out.println("Anna 2. luku");
        int UserNumber2 = Integer.parseInt(c.readLine());
        System.out.println("\n-----");
        int sum = UserNumber1 + UserNumber2;
                
        if(sum == 10){
            System.out.println("Se oli kymppi!");
        }else{
            System.out.println("Se ei ollut kymppi.");
        }

    }
}

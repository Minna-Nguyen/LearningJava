import java.io.Console;

public class tehtava12 {
    public static void main (String [] args){
        Console c = System.console();

        System.out.println("Mika on pistemaarasi?");
        int luku = Integer.parseInt(c.readLine());

        if (luku>=0 && luku<=8)
        System.out.println("Arvosanasi on improbatur");
        else if(luku>=9 && luku<=16)
        System.out.println("Arvosanasi on approbatur");
        else if(luku>=17 && luku<=24)
        System.out.println("Arvosanasi on lubenter");
        else if(luku>=25 && luku<=35)
        System.out.println("Arvosanasi on cum laude");
        else if(luku>=36 && luku<=44)
        System.out.println("Arvosanasi on magna");
        else if(luku>=45 && luku<=52)
        System.out.println("Arvosanasi on eximia");
        else if(luku>=53 && luku<=60)
        System.out.println("Arvosanasi on laudatur");
        else{
            System.out.println("Oho!");
        }

    }
}
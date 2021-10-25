import java.io.Console;

public class tehtava19{
    public static void main (String [] args){
        Console c = System.console();

    System.out.println("Kivi=1, paperi=2 ja sakset=3");
    System.out.println();
    System.out.println("Pelaaja");
    System.out.println("Valitse kivi, paperi tai sakset. Kayta vastaavia numeroita");
    int P1 = Integer.parseInt(c.readLine());

    if(P1>=1 && P1<=3){ 
        switch(P1){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
        }
    }else{
        while(P1<1||P1>3){
    System.out.println("Valitse kivi, paperi tai sakset. Kayta vastaavia numeroita");
    P1 = Integer.parseInt(c.readLine());
     switch(P1){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
        }
    }
} 
    System.out.println();

/*satunnaisluku [o,1[ muuttujaan x*/
    double x =1+Math.random()*3;
    int i = (int)x;
    System.out.println("Tietokone valitsee " + i);
    switch(i){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
    }
 if(P1==1 && i==3){
        System.out.println("Pelaaja voittaa");
    }else if(P1==2 && i==1){
        System.out.println("Pelaaja voittaa");
    }else if(P1==3 && i==2){
        System.out.println("Pelaaja voittaa");
    }else if(P1==i){
        System.out.println("Tasapeli");
    }else{
        System.out.println("Tietokone voittaa");
    }


    }
}
import java.io.Console;

public class tehtava18{
    public static void main (String [] args){
        Console c = System.console();

    System.out.println("Kivi=1, paperi=2 ja sakset=3");
    System.out.println();
    System.out.println("Pelaaja1");
    System.out.println("Valitse kivi, paperi tai sakset. Kayta vastaavia numeroita");
    int P1 = Integer.parseInt(c.readLine());

    if(P1>=1 && P1<=3){
       
        switch(P1){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
    }}else{
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
    
    System.out.println("Kivi=1, paperi=2 ja sakset=3");
    System.out.println();
    System.out.println("Pelaaja2");
    System.out.println("Valitse kivi, paperi tai sakset. Kayta vastaavia numeroita");
    int P2 = Integer.parseInt(c.readLine());

    if(P2>=1||P2<=3){
    switch(P2){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
    }
    }else{
        while(P2<1||P2>3){
    System.out.println("Valitse kivi, paperi tai sakset. Kayta vastaavia numeroita");
    P2 = Integer.parseInt(c.readLine());
 switch(P2){
        case 1: System.out.println("kivi"); break;
        case 2: System.out.println("paperi"); break;
        case 3: System.out.println("sakset"); break;
        }
    }
}
    if(P1==1 && P2==3){
        System.out.println("Pelaaja1 voittaa");
    }else if(P1==2 && P1==1){
        System.out.println("Pelaaja1 voittaa");
    }else if(P1==3 && P2==2){
        System.out.println("Pelaaja1 voittaa");
    }else if(P1==P2){
        System.out.println("Tasapeli");
    }else{
        System.out.println("Pelaaja2 voittaa");
    }
    }
}

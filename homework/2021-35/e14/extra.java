
import java.io.Console;  

public class extra {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
    int luku = Integer.parseInt(c.readLine());
    int count = 0;
        
    if(luku>count)
        System.out.println("...");
        System.out.println("Kokeile jotain pienempaa");
    int luku2 = Integer.parseInt(c.readLine()); 
        System.out.println("...");
    if(luku2<0){
        System.out.println("Hyva! Loppuu tahan.");
        System.out.println("Suurin lukusi on: ");
        System.out.println(luku);
    
}else{
        System.out.println("Kokeile muuta :)");
        System.out.println("...");
}

    int luku3 = Integer.parseInt(c.readLine());
        System.out.println("...");
 if(luku3<0){
        System.out.println("Mahtavaa! Loppuu tahan.");
    
        System.out.println("Suurin lukusi on: ");
        System.out.println(luku);
        System.out.println("...");
 }else{

        System.out.println("Kokeile muita kokonaislukuja?");
        System.out.println("...");
 }
    int luku4 = Integer.parseInt(c.readLine());
if(luku4>0){
        System.out.println("Yrita pienempaa lukua");
        System.out.println("...");
        
    int luku5 = Integer.parseInt(c.readLine());
if (luku5>0){
while (true){
        System.out.println("PIENI kokonaisluku, ei voi olla vaikeeta");
    int luku6 =Integer.parseInt(c.readLine());
if(luku6<0){
    System.out.println("VIIMEINKIN!");
    String eka ="Syotit monta vaihtoehtoa";
    String toka =", en osaa valita niista suurinta lukua";
    
    System.out.println(eka+toka);
    break;
}
//ONGELMA --> while (true) loop antaa 
//monta mahdollista vastausta miten niistä valitaan 
//suurin luku? :D
    
}

}else {
    System.out.println("Jee! Loppuu tahan");
if(luku>luku3){
    System.out.println("Suurin lukusi");
    System.out.println(luku);
}else if(luku>luku4){
    System.out.println("Suurin lukusi");
    System.out.println(luku);
}

}//jeee loppuu -kohdan

   
}else {
        System.out.println("Hienoa! Loppuu tahan.");
  
if(luku3<luku){
        System.out.println("Suurin lukusi on: ");
        System.out.println(luku);
        System.out.println("...");
} else if (luku3>luku){
        System.out.println("Suurin lukusi on: ");
        System.out.println(luku3);
}

    }
   

    }

}






        

    

        
        
        
    



    
    
    
  



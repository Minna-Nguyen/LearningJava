import java.io.Console;

class Main{
    public static void main (String [] args){

        //kysytään käyttäjältä luku//
        Console c = System.console();
        System.out.println("Taulukon koko?");
        int koko = Integer.parseInt(c.readLine());
        String [] taulukko = new String[koko];
        System.out.println("koko? " +taulukko.length);
    

        
        System.out.println("Anna nimi/nimet");
        String UserNimet = "";
        for(int i = 0; i<koko; i++){
        UserNimet = UserNimet + c.readLine();
        
        
        String [] nimet = new String[koko];
        nimet[i] = UserNimet;
        }
        System.out.println(nimet.length);
      
        /*  String [] nimet = {"joo", "jaasu"};
        for(int j = 0; nimet.length>j; j++){
    

        System.out.println(nimet[j]);
        }*/




/*
        int [] taulukko = new int[10]; 
        for(int i=0; taulukko.length-1>=i; i++){
        System.out.println("Anna " + (i+1) + ". " + "numero");
        int luku = Integer.parseInt(c.readLine());
        taulukko[i] = luku; 
        
        int summa = 0;
        for(int j = 0; j<=taulukko.length-1; j++){
        summa = summa + taulukko[j]; 
        }        
        System.out.println("tulos " +summa);

        }*/




        
    }
}
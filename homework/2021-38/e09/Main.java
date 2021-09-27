import java.io.Console;

class Main{
    public static void main (String [] args){

        //kysytään käyttäjältä taulukon kokoa//
        Console c = System.console();
        System.out.println("Taulukon koko?");
        int koko = Integer.parseInt(c.readLine());

        String [] nimet = new String [koko];

        for(int i = 0; i<nimet.length; i++){
        System.out.println("Anna " + (i+1) + ". " + "nimi");
        String UserNimet = c.readLine();
        nimet[i]= UserNimet; /* n. paikka = käyttäjän antama n. nimi*/
        System.out.println("---");
        }

        /*taulukossa tallennetut nimet printataan yksitellen*/
        String pisin = nimet[0];

        for(int j = 0; j<nimet.length; j++){
        System.out.println(nimet[j]);
        System.out.println("Nimen pituus " +nimet[j].length());
        System.out.println("---");
        if(pisin.length()<nimet[j].length()){
        pisin = nimet[j];   //uusi pisin nimi tallentunut tähän, korvaa alkuperäisen "pitkän"nimen
            }
        }
        System.out.println("Pisin nimi on "+pisin);
    }
}
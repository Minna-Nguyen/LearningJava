
public class Main{
    public static void main (String [] args) {
      
    String [] taulukko = StringHelper.split("tiina,pekka,kalle");
    System.out.println(taulukko[0]); // tulostaa "tiina"
    System.out.println(taulukko[1]); // tulostaa "pekka"
    System.out.println(taulukko[2]); // tulostaa "kalle"
    }
}
class StringHelper{
    public static String [] split(String nimet){
        String [] taulukko = new String [3];
        int sana = 0;
        

        //taulukolle tyhjä merkki, jolloin taulukko ei ole NULL eli 0 

        taulukko[0] = "";
        taulukko[1] = "";
        taulukko[2] = "";

      
       for (int i = 0; i<nimet.length(); i++){
           //jos merkkijono ei ole chartAt(i) kohdalla ',' niin lisää se taulukkoon
           //muulloin siirrytään taulukosta eteenpäin [0]-> [1]
            if(!(nimet.charAt(i)==',')){
                taulukko[sana] = taulukko[sana] + nimet.charAt(i);
            }else{
                sana++;
            }
        }
        return taulukko;
    }
}
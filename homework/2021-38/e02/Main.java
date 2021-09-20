
class Main {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
       int [] taulukko = new int[3];  

       taulukko[0] = 12;
       taulukko[1] = 99;
       taulukko[2] = 32;

       // tulostetaan arvot
       System.out.println("Taulukon ensimmainen luku on " + taulukko[0]);
       System.out.println("Taulukon viimeinen luku on " + taulukko[2]);
      
      // tulostetaan taulukon pituus
      System.out.println("Taulukon pituus on " + taulukko.length);
    }
}
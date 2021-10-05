
class MyApp {
    public static void main(String [] args) {
             
        System.out.println( tulosta('x', itseisarvo(-3)) );
        System.out.println( tulosta('a', itseisarvo(4))  );
        }

    public static String tulosta (char a, int maara) {
        String pituus ="";
        for(int i=0; i<maara; i++) {
            pituus = pituus + a;
        }
            return pituus;
    }   

    public static int itseisarvo(int luku){

        if(luku<0){
            return luku *-1;
        }else{
            return luku;
        }       
    }
}
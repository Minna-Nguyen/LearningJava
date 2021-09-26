

class Main{
    public static void main (String [] args){
        String [] nimet = {"Felix","Bangchan","Lisa", "Jake", "Jay", "Hongjoon"};
                            /*0      1          2        3       4       5*/
        for(int i = 0; nimet.length>i; i=i+2){
            /*tulostaa joka toisen nimen, alkaen [0] = Felix*/
            System.out.println(nimet[i]);
        }
    }
}
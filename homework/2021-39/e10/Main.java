

public class Main {
    
    public static void main (String [] args) {
    //String mj = MyString.replaceAll("abc:abc:", 'a', "terve");

    System.out.println(MyString.replaceAll("abc:abc:", 'a', "terve"));
    }
}

class MyString {
    public static String replaceAll(String mj, char b, String c) {
    int length = mj.length();
    String palautus = "";
       for(int i = 0; i<length; i++){
           if(mj.charAt(i)==b){
               palautus = palautus + c;
            }else {
                palautus = palautus + mj.charAt(i);
            }
        }
        return palautus;
           // palautus = palautus + vaihto ;
    }
}



public class Main{
    public static void main (String [] args) {
        String [] stringArray = {"12", "22", "33"};
      
        int [] intArray = StringHelper.toIntArray(stringArray);
        System.out.println(intArray[0]); 
        System.out.println(intArray[1]); 
        System.out.println(intArray[2]); 
        }
}
class StringHelper{
    public static  int [] toIntArray(String [] testii){
       
        int [] luvut = new int[3];
        
       for (int i = 0; i<testii.length; i++){
           luvut[i] = Integer.parseInt(testii[i]);
        }
        return luvut;
    }
}
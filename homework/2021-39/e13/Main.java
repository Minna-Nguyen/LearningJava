

public class Main{
    public static void main(String []args){
    int min = (int) (Math.random()*51);
    int max = (int) (Math.random()*51);
        System.out.println(MyMath.getRandom(min, max));
    }
}
class MyMath{
    public static int getRandom(int min, int max){
    
        if(min<max){
            return min;
        }else{
            return max;
        }
    }
}
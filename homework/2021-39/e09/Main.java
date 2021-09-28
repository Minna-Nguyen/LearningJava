
class Main {

    public static void main(String [] args) {
    asetaA();
    asetaB();
    laskeYhteen();
    tulosta();
    }
    
    static int a = 0;
    public static void asetaA() {
        a = 5;
    }
    static int b = 0;
    public static void asetaB() {
        b = 5;
    }
    static int summa = 0;
    public static void laskeYhteen() {
        summa = a + b;
    }

    public static void tulosta() {
        System.out.println(summa);
    }
}
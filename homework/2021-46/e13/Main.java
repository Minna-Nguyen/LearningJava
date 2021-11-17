import java.util.function.*;

import javax.swing.*;

import java.util.*;

class Kuuntelija implements Consumer<String> {
    public void accept(String t) {
        System.out.println(t);
    }
}

class Main {
    public static void main (String [] args) {

    Kuuntelija olio = new Kuuntelija();
    LinkedList<String> lista = new LinkedList<String>();
    lista.add("moi");
    lista.add("hei");
    lista.add("HELLO");
    
        class Sisakkainen implements Consumer<String> {
            public void accept(String t) {
                System.out.println(t);
            }
        }
    Sisakkainen sisa = new Sisakkainen();
    
    System.out.println("ulkoluokka tapa:");
    lista.forEach(olio);
    System.out.println("Metodin sisakkainen sisaluokka:");
    lista.forEach(sisa);
    
    System.out.println("Anonyymi tapa:");
    lista.forEach(new Consumer<String>() {
        public void accept(String t) {
            System.out.println(t);
        }
    });
   
    System.out.println("Lambda tapa:");
    lista.forEach((s) -> System.out.println(s));
    System.out.println("Method reference tapa:");
    lista.forEach(System.out::println);


    }
}
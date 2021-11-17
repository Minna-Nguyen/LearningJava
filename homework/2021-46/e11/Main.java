
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("click");
        add(click);

        //Koska lambda kutsuu nyt ainoastaan yhtä metodia ja metodin argumentit ovat samat kuin rajapinnassa
        //voidaan käyttää method referenciä
        //this olio viittaa MyWindow olioon (nimeltä window -> tuolla main metodissa)
        click.addActionListener(this::clicked);
    }

    
    public void clicked(ActionEvent e) {
        System.out.println("HEI HEII harrrharr");     
        // Runnable r = () -> System.out.println("toimiiko lambda?");  
        // new Thread(r).start();
        Thread t = new Thread(() -> System.out.println("Toimiiko mun lambda?"));
        t.start();

        new Thread(() -> System.out.println("toimiiko anonyymi lambda?")).start();
    }

}

class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow();
        window.setTitle("window is Window");
        window.setSize(400,400);
        window.setVisible(true);
    }
}
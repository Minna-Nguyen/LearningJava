
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("click");
        add(click);

        // class X implements ActionListener {
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("moro");
        //     }
        // }
        
        // click.addActionListener(new X());


        // click.addActionListener(e -> System.out.println("ANONYYMI click"));
    
        //lamnda jolla metodi       rajapinnassa oleva metodi -> public void clicked
        // click.addActionListener(e -> clicked(e));
        
        //Koska lambda kutsuu nyt ainoastaan yhtä metodia ja metodin argumentit ovat samat kuin rajapinnassa
        //voidaan käyttää method referenciä
        //this olio viittaa MyWindow olioon (nimeltä window -> tuolla main metodissa)
        click.addActionListener(this::clicked);
    
    }

    
    public void clicked(ActionEvent e) {
        System.out.println("HEI HEII harrrharr");     
    }

}

class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow();
        window.setTitle("window");
        window.setSize(400,400);
        window.setVisible(true);
    }
}
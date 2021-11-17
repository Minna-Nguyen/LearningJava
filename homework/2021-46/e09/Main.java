
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("click");
        add(click);



    // class Mickey implements ActionListener {
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println("click");
    //     }
    // }

    // Actionisener() on rajainta, ei tiedetä luokkaa 
    // jolla on tämä rajapinta. Millä tahansa luokalla voi 
    //olla tämä rajapinta

    //Jos Actionistener() sijaan olisi ollut Mickey() se tarkoittaisi sitä,
    //luo anonyyymi olio joka periytyy Mickey luokasta(joka toteuttaa rajapinta ActionListener())
    // click.addActionListener(new ActionListener() {
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println("ANONYYMI click");
    //     }
    // });

    click.addActionListener(e -> System.out.println("ANONYYMI click"));





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
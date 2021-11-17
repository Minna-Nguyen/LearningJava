
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("NO clickity click!!");
        add(click);

        //painike aktivoi clicked metodin
        click.addActionListener((e) -> clicked(e));
    }
    
    //ikkuna hyppii näytöllä
    public void doIt() {

        while (true){
            int y = (int) (Math.random() *1000);
            int x = (int) (Math.random() *1000);

            setLocation(x,y);
            try {
                Thread.sleep(950);
            }catch (Exception n){}
        }
    }
    
    public void clicked(ActionEvent e) {
        //suoritetaan doIt metodi
        Thread t = new Thread(this::doIt);
        t.start();
        click.setText("Aight try and catch me! Hmph!");
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
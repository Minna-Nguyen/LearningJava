
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {

    click = new JButton("click");
    add(click);

    class Mickey implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("click");
        click.setText("HAAR HAR TOIMII");
        }
    }
        Mickey listener = new Mickey();
        click.addActionListener(listener);

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
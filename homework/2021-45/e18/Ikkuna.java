
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Kuuntelija extends JFrame implements ActionListener{
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("moi, wtf tapahtui mutta... CLICK THIS");
    }
}

class Ikkuna extends JFrame implements ActionListener {
    private JButton ok;
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("ikkunan otsikko on nyt moi!");
        this.setTitle("moi");
    }

    public Ikkuna() {
        ok = new JButton("ok");
        add(ok);

        setSize(500,500);
        setVisible(true);
        
        Kuuntelija olio = new Kuuntelija();
        ok.addActionListener(this); //ikkunaluokassa oollaan
     
    }

    // public void JButton setJButton(Ikkuna ok) {
    //     this.ok = ok;
    // }
    // public JButton getJButton(){
    //     return ok;
    // }

    public static void main(String [] args) {
        new Ikkuna();
        
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ikkuna extends JFrame implements ActionListener, Runnable {
    private JButton ok;
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("LIIKUN LIIKUN!");
        this.setTitle("moi");

        Thread t = new Thread(this);
        t.start();
        
        //Runnable rajapinta
        if(t.getId()==(20)){
            System.out.println("Lopetetaan");
            System.exit(0);
        }
    }


    public void run() {
        int x = 0;

        while(true){
            for(int i = 0; i<950; i++){
                setLocation(x,100);
                x++;
                    try {
                        Thread.sleep(2);
                    } catch(Exception e) {
                        e.printStackTrace();
                }
            }

            for(int i = 950; i>0; i--){
                setLocation(x,100);
                x--;
                    try {
                        Thread.sleep(2);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
    }
    

    public Ikkuna() {
        ok = new JButton("YAYY");
        add(ok);
        setSize(350,350);
        setVisible(true);
       
        ok.addActionListener(this); //ikkuna olio (main metodissa) ei kuuntelija luokan olio
      
    }

    public static void main(String [] args) {
        new Ikkuna();

    }
}
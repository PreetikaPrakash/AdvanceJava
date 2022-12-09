import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class SwingInheritance extends JFrame {

    SwingInheritance(){
        JButton b = new JButton("click");
        b.setBounds(200,300,300,150);
        b.setBackground(Color.blue);
        b.setForeground(Color.red);
        add(b);
        setSize(700,700);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SwingInheritance();
    }
}

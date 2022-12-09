import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonImage {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField();
        tf.setSize(450,750);
        tf.setBounds(150,50,420,50);
        JButton b = new JButton(new ImageIcon("JButton/buttonicon/istockphoto-1133992590-170667a.jpg"));
        b.setBounds(100,200,500,200);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Opening text field");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(900,900);
        f.setLayout(null);
        f.setVisible(true);
    }
}

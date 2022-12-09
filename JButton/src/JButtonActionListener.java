import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonActionListener {
    public static void main(String[] args) {
            JFrame f = new JFrame();
            JTextField tf = new JTextField();
            tf.setSize(450,750);
            tf.setBounds(150,50,420,50);
            JButton b = new JButton("click it");
            b.setBounds(200,300,300,40);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tf.setText("Opening text field");
                }
            });
            f.add(b);
            f.add(tf);
            f.setSize(700,700);
            f.setLayout(null);
            f.setVisible(true);
    }
}

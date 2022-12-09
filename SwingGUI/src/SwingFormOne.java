import javax.swing.*;

public class SwingFormOne {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(200,300,300,40);
        f.add(b);
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    }
}

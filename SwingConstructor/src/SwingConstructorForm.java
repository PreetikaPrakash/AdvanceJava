import javax.swing.*;

public class SwingConstructorForm {

    SwingConstructorForm(){
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(200,300,300,150);
        f.add(b);
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new SwingConstructorForm();
    }

}

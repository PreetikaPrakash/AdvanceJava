import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJPassword {
    public static void main(String[] args) {

        final JLabel jl1 = new JLabel("Username");
        final JLabel jl2 = new JLabel("Password");
        JLabel jl3 = new JLabel();
        jl1.setBounds(50,50,100,50);
        jl2.setBounds(50,100,100,50);
        jl3.setBounds(250,400,400,50);

        final JTextField tf1 = new JTextField();
        tf1.setBounds(250,50,400,50);

        final JPasswordField jp = new JPasswordField();
        jp.setBounds(250,100,400,50);

        JButton jb = new JButton("Login");
        jb.setBounds(350,200,100,100);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = new String(jp.getPassword()); //getPassword() method returns a char array.
                jl3.setText("Username is "+tf1.getText()+" & Password is "+pass );
            }
        });

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(900,900);

        f.add(jl1);
        f.add(jl2);
        f.add(jl3);
        f.add(tf1);
        f.add(jp);
        f.add(jb);



    }
}

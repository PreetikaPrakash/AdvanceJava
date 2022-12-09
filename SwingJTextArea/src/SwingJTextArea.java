import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTextArea extends Frame implements ActionListener {

    JTextArea ja;JButton jb;JLabel jl1,jl2,jl3;
    SwingJTextArea(){
        ja = new JTextArea();
        ja.setBounds(200,150,500,300);
        ja.setBackground(Color.lightGray);

        jb = new JButton("Calculate");
        jb.setBounds(200,500,500,50);
        jb.setBackground(Color.green);
        jb.addActionListener(this);

        jl1 = new JLabel();
        jl2 = new JLabel();
        jl3 = new JLabel();
        jl1.setBounds(200,50,150,50);
        jl2.setBounds(500,50,150,50);
        jl3.setBounds(200,250,150,50);

        add(ja);
        add(jb);
        add(jl1);add(jl2);add(jl3);

        setVisible(true);
        setLayout(null);
        setSize(900,900);

    }


    public static void main(String[] args) {
        new SwingJTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String Storetext =  ja.getText();
            String wordsstorage[] = Storetext.split("\\s");
            for(int i =0;i<wordsstorage.length;i++){
                System.out.println(wordsstorage[i]);
            }

            jl1.setText("Words are "+wordsstorage.length);
            jl2.setText("Characters are "+Storetext.length());

        }
        catch(Exception ex){
            System.out.println(ex);

        }
    }
}

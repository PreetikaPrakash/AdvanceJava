// ADD & SUBSTRACT

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTextField extends Frame implements ActionListener {

    JLabel jl1,jl2,jl3,jl4;JButton jb1,jb2;JTextField jf1,jf2,jf3,jf4;
    SwingJTextField(){

        jl1 = new JLabel("Enter first number");
        jl2 = new JLabel("Enter second number");
        jl3 = new JLabel("Result");
        jl4 = new JLabel();
        jb1 = new JButton("ADD");
        jb2 = new JButton("SUBSTRACT");
        jf1 = new JTextField();
        jf2 = new JTextField();
        jf3 = new JTextField();
        jf4 = new JTextField();

        jl1.setBounds(150,0,150,150);
        jl2.setBounds(150,100,150,150);
        jl3.setBounds(150,200,150,150);
        jl4.setBounds(250,600,350,150);

        jb1.setBounds(150,450,150,150);
        jb2.setBounds(450,450,150,150);


        jf1.setBounds(150,80,450,50);
        jf1.setBackground(Color.lightGray);
        jf2.setBounds(150,180,450,50);
        jf2.setBackground(Color.lightGray);
        jf3.setBounds(150,280,450,50);
        jf3.setBackground(Color.lightGray);
        jf3.setEditable(false);

        jf4.setBounds(150,200,450,50);
        jf4.setBackground(Color.pink);


        jb1.addActionListener(this);
        jb2.addActionListener(this);


        add(jl1);add(jl2);add(jl3);add(jl4);
        add(jb1);add(jb2);
        add(jf1);
        add(jf2);
        add(jf3);
        add(jf4);

        setBackground(Color.black);
        setSize(800,800);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        new SwingJTextField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String textf1 = jf1.getText();
            String textf2 = jf2.getText();
            int a = Integer.parseInt(textf1);
            int b = Integer.parseInt(textf2);
            int c= 0;

            if(e.getSource()==jb1){ // checking if button add was clicked
                c=a+b;
                jl4.setText("*ADD button was clicked");
            }
            else if(e.getSource()==jb2){ // checking if button subtract was clicked
                c=b-a;
                jl4.setText("*SUBTRACT button was clicked");
            }

            String result = String.valueOf(c);
            jf3.setText(result);

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

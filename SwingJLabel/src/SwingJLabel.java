import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class SwingJLabel extends Frame implements ActionListener {
    JLabel jl;JButton jb;JTextField jf;
    SwingJLabel(){
        jb = new JButton("FIND IP");
        jb.setBounds(300,250,150,150);
        jf = new JTextField();
        jf.setBounds(150,50,450,150);
        jl = new JLabel();
        jl.setBounds(150,100,250,150);

        jb.addActionListener(this);
        add(jb);add(jf); add(jl);

        setSize(800,800);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        new SwingJLabel();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // what action will be performed on clicking
        try{
            String store = jf.getText();
            String temp_store = java.net.InetAddress.getByName(store).getHostAddress();
            jl.setText("IP Address of "+ store + " is "+ temp_store);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

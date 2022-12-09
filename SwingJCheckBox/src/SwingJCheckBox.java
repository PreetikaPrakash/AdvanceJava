import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJCheckBox extends Frame implements ActionListener {
    JLabel jl5;
    JButton jb;
    JCheckBox jl1,jl2,jl3,jl4;
    SwingJCheckBox(){

        jl5 = new JLabel("List of Items in Shop");
        jl5.setBounds(150,20,400,50);

        jb = new JButton("Calculate");
        jb.setBounds(150,300,200,100);
        jb.addActionListener(this);

        jl1 = new JCheckBox("T-Shirt @ 400 ");
        jl2 = new JCheckBox("Socks @ 150");
        jl3 = new JCheckBox("Scarf @ 600");
        jl4 = new JCheckBox("Mask @ 500");

        jl1.setBounds(150,70,400,50);
        jl2.setBounds(150,120,400,50);
        jl3.setBounds(150,170,400,50);
        jl4.setBounds(150,220,400,50);

        setVisible(true);
        setLayout(null);
        setSize(500,500);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(jl5);
        add(jb);
        add(jl1);add(jl2);add(jl3);add(jl4);
    }
    public static void main(String[] args) {
        new SwingJCheckBox();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String message ="";
        if(jl1.isSelected()){
            amount +=400;
            message+="Tshirt : 400\n";
        }
        if(jl2.isSelected()){
            amount +=150;
            message +="Socks : 150\n";
        }
        if(jl3.isSelected()){
            amount +=600;
            message += "Scarf : 600\n";
        }
        if(jl4.isSelected()){
            amount +=500;
            message += "Mask : 500\n";
        }
        message+="-----------------\n";
        JOptionPane.showMessageDialog(this,message+"Total: "+amount);
    }
}

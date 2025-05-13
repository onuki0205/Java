import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.*;

class ExGUISwing_02 extends ExGUISwing_01{
    protected JButton button[] = new JButton[6];
    JButton btnToCD = new JButton("CD");
    JButton btnToAM = new JButton("AM");
    JButton btnToFM = new JButton("FM"); 
    JButton btnPW = new JButton("PW");
    JButton btnUp = new JButton("Up");
    JButton btnDown = new JButton("Down");
    protected JPanel panel = new JPanel();
    protected BevelBorder border = new BevelBorder(BevelBorder.LOWERED, Color.white, Color.gray);
    protected JLabel label = new JLabel();

    public ExGUISwing_02(){
        super();

        Container container = super.getContentPane();

        panel.setLayout(null);
        label.setLayout(null);

        
        getContentPane().setLayout(null);
        btnToCD.setBounds(280, 5, 70, 30);
        add(btnToCD);
        btnToAM.setBounds(2, 45, 70, 30);
        add(btnToAM);
        btnToFM.setBounds(2, 85, 70, 30);
        add(btnToFM);
        btnPW.setBounds(2, 5, 70, 30);
        add(btnPW);
        btnUp.setBounds(280, 45, 70, 30);
        add(btnUp);
        btnDown.setBounds(280, 85, 70, 30);
        add(btnDown);

        panel.setBorder(border);
        panel.setLocation(75,2);
        panel.setSize(200, 105);

        container.add(panel);

        label = new JLabel("Power off");
        label.setFont(new Font("Arial", Font.BOLD, 32));
        label.setForeground(new Color(0, 128, 0));
        label.setBounds(25, 50, 170, 40);
        panel.add(label, BorderLayout.CENTER);


    }

    public static void main(String argv[]){
        JFrame jframe = new ExGUISwing_02();
        jframe.setVisible(true);
    }
}

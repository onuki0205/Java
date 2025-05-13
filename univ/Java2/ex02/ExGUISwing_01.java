import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExGUISwing_01 extends JFrame {
    

    public ExGUISwing_01(String title){
        super();
        super.setTitle(title);
        super.setSize(400,200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String argv[]){
        JFrame jframe = new ExGUISwing_01();
        jframe.setVisible(true);

    }

}

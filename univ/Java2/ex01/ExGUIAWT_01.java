import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ExGUIAWT_01" width=400 height=300></applet>
*/
public class ExGUIAWT_01 extends Applet{
    private String text = "April 13,2020";
    Color selectedColor = null;

    public void init(){
        resize(400,300);
    }

    public void paint(Graphics g){
        g.drawString(text, 100, 200);
        g.setColor(Color.red);
        g.drawOval(100,100,200,200);
    }
}

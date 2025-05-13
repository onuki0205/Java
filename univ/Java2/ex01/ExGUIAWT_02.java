import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ExGUIAWT_02" width=400 height=300>
</applet>
*/

public class ExGUIAWT_02 extends ExGUIAWT_01 implements ActionListener{
    private Button btn_r ;
    private Button btn_l ;
    protected Label label;
    protected int n = 0;


    public void init(){
        super.init();
        btn_r = new Button("+");
        btn_l = new Button("-");
        label = new Label("0");

        btn_r.addActionListener(this);
        btn_l.addActionListener(this);
        add(btn_l);
        add(label);
        add(btn_r);
    }

    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        if(o == btn_r){
            n++;
            label.setText(String.valueOf(n));
        }
        if(o == btn_l){
            n--;
            label.setText(String.valueOf(n));
        }
    }


}

import java.awt.*;
import java.awt.event.*;

public class Lec8_HandlingScrollBars extends WindowAdapter implements AdjustmentListener{
    Frame f;
    Scrollbar vertSB, horzSB;
    Label l;

    Lec8_HandlingScrollBars(){
        f = new Frame();
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Mouse Scrollbar Program");
        f.setSize(400,400);
        init();
        add_components();
    }

    public void init(){
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 11);
        vertSB.setPreferredSize(new Dimension(20,100));
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 11);
        horzSB.setPreferredSize(new Dimension(100,20));
        l = new Label();
    }

    public void add_components(){
        vertSB.setBounds(30,50,20,100);
        horzSB.setBounds(100,100,100,20);
        f.add(vertSB);
        f.add(horzSB);

        l.setBounds(50,500,400,40);
        f.add(l);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void adjustmentValueChanged(AdjustmentEvent e){
        l.setText("Vertical : " + vertSB.getValue() + " Horizontal : " + horzSB.getValue());
    }

    public static void main(String [] args){
        new Lec8_HandlingScrollBars();
    }
}
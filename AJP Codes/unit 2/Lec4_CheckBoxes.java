import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Lec4_CheckBoxes extends WindowAdapter implements ItemListener{
    Frame f;
    Checkbox windows, android, solaris, mac;
    Label l1,l2,l3,l4,l5;

    Lec4_CheckBoxes(){
        f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Check boxes handling");
        init();
        add_components();
    }

    public void init(){
        windows = new Checkbox("WINDOWS");
        android = new Checkbox("ANDROID");
        solaris = new Checkbox("SOLARIS");
        mac = new Checkbox("MAC");

        l1 = new Label();
        l2 = new Label();
        l3 = new Label();
        l4 = new Label();
        l5 = new Label();
    }

    public void add_components(){
        windows.setBounds(50,100,75,40);
        f.add(windows);
        android.setBounds(150,100,75,40);
        f.add(android);
        solaris.setBounds(50,175,75,40);
        f.add(solaris);
        mac.setBounds(150,175,75,40);
        f.add(mac);

        l1.setBounds(50,250,75,30);
        l2.setBounds(50,300,75,30);
        l3.setBounds(50,350,75,30);
        l4.setBounds(50,400,75,30);
        l5.setBounds(50,450,75,30);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

        f.addWindowListener(this);
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    public void windowClosing (WindowEvent e){
        f.dispose();
    }
    
    public void itemStateChanged(ItemEvent ie){
        l1.setText("Current State : ");
        l2.setText("Windows : " + windows.getState());
        l3.setText("Android : " + android.getState());
        l4.setText("Solaris : " + solaris.getState());
        l5.setText("Mac : " + mac.getState());
    }

    public static void main(String [] args){
        new Lec4_CheckBoxes();
    }
}
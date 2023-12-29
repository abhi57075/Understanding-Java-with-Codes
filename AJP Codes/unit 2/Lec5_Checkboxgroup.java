import java.awt.*;
import java.awt.event.*;

public class Lec5_Checkboxgroup extends WindowAdapter implements ItemListener{
    Frame f;
    Label l;
    Checkbox windows,android,solaris,mac;
    CheckboxGroup cbg;

    Lec5_Checkboxgroup(){
        f = new Frame();
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Checkbox group program");
        init();
        add_components();
    }

    public void init(){
        l = new Label();
        cbg = new CheckboxGroup();
        windows = new Checkbox("WINDOWS",cbg, false);
        android = new Checkbox("ANDROID",cbg, false);
        solaris = new Checkbox("SOLARIS",cbg, false);
        mac = new Checkbox("MAC",cbg, false);
    }

    public void add_components(){
        windows.setBounds(20,100,75,30);
        f.add(windows);
        android.setBounds(100,100,75,30);
        f.add(android);
        solaris.setBounds(20,150,75,30);
        f.add(solaris);
        mac.setBounds(100,150,75,30);
        f.add(mac);

        l.setBounds(50,200,200,50);
        f.add(l);

        f.addWindowListener(this);
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void itemStateChanged(ItemEvent ie){
        l.setText("Current Selection : " + cbg.getSelectedCheckbox().getLabel()); // Important
    }

    public static void main(String args[]){
        new Lec5_Checkboxgroup();
    }
}
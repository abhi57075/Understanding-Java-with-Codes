import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Lec6_ChoiceLists extends WindowAdapter implements ItemListener{
    Frame f;
    Choice os, browser;
    Label l1,l2;

    Lec6_ChoiceLists(){
        f = new Frame();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        f.setTitle("Choice Lists program");
        init();
        add_components();
    }
    
    public void init(){
        os = new Choice();
        browser = new Choice();
        l1 = new Label();
        l2 = new Label();
    }

    public void add_components(){
        os.add("WINDOWS");
        os.add("ANDROID");
        os.add("SOLARIS");
        os.add("MAC");

        browser.add("FIREFOX");
        browser.add("INTERNET EXPLORER");
        browser.add("CHROME");

        os.setBounds(20,100,100,100);
        f.add(os);
        browser.setBounds(150,100,200,100);
        f.add(browser);

        l1.setBounds(50,200,200,50);
        l2.setBounds(50,275,300,50);
        f.add(l1);
        f.add(l2);

        os.addItemListener(this);
        browser.addItemListener(this);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void itemStateChanged(ItemEvent ie){
        l1.setText("Current OS : " + os.getSelectedItem());
        l2.setText("Current Browser : " + browser.getSelectedItem());
    }

    public static void main(String [] args){
        new Lec6_ChoiceLists();
    }

}
import java.awt.*;
import java.awt.event.*;

public class Lec7_Lists extends WindowAdapter implements ActionListener{
    Frame f;
    List os, browser;
    Label l1,l2;

    Lec7_Lists(){
        f = new Frame();
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("lists program");
        f.setSize(400,400);
        init();
        add_components();
    }

    public void init(){
        os = new List(4, true);
        browser = new List(4, false);

        l1 = new Label();
        l2 = new Label();  
    }

    public void add_components(){
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac os");

        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        //browser.select(); // Important

        os.setBounds(20,50,100,300);
        f.add(os);
        browser.setBounds(150,50,300,300);
        f.add(browser);

        l1.setBounds(50,500,300,30);
        f.add(l1);
        l2.setBounds(50,550,300,30);
        f.add(l2);

        os.addActionListener(this);
        browser.addActionListener(this); 
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void actionPerformed(ActionEvent ae){
        int index[];
        String msg = "";
        index = os.getSelectedIndexes();
        for (int i = 0; i<index.length; i++){
            msg += os.getItem(index[i]) + " ";
        }
        l1.setText("Current OS : " + msg);
        l2.setText("Current browser : " + ae.getActionCommand());
    }

    public static void main(String args[]){
        new Lec7_Lists();
    }
}
import java.awt.*;
import java.awt.event.*;

public class Lec12_DialogBoxes extends WindowAdapter implements ActionListener{
    Frame f,f1;
    // Dialog d;
    Label l1,l2;
    Button b1,b2,b3;

    Lec12_DialogBoxes(){
        f = new Frame();
        f.setTitle("Dialog Box Example");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);
        f1 = new Frame();
        // d = new Dialog(f,"DIALOG",true);
        init();
        add_components();
    }

    public void init(){
        l1 = new Label();
        l2 = new Label();
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
    }

    public void add_components(){
        l1.setBounds(20,50,200,40);
        l1.setText("Press any button");
        f.add(l1);

        b1.setBounds(20,120,80,40);
        f.add(b1);

        b2.setBounds(120,120,80,40);
        f.add(b2);

        b3 = new Button("OK");
        b3.setBounds(50,100,50,30);
        f1.add(b3);

        b3.addActionListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        f.setVisible(false);
        
        f1.setLayout(null);
        f1.setSize(400,400);
        f1.setVisible(true);

        l2.setBounds(20,50,200,40);

        if (e.getSource() == b1){
            l2.setText("You pressed button b1");
            f1.add(l2);
        }

        else if (e.getSource() == b2){
            l2.setText("You pressed button b2");
            f1.add(l2);
        }

        else if (e.getSource() == b3){
            f1.setVisible(false);
            f.setVisible(true);
        }          
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }
    
    public static void main(String args[]){
        new Lec12_DialogBoxes();
    }
}
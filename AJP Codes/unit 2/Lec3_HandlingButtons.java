import java.awt.*;
import java.awt.event.*;


public class Lec3_HandlingButtons extends WindowAdapter implements ActionListener{
    Frame f;
    Button yes,no,maybe;
    Label l;
    String msg = "";

    Lec3_HandlingButtons(){
        f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Buttons Handling Program");
        init();
        add_components();
    }

    public void init(){
        l = new Label();

        yes = new Button("YES");
        no = new Button("NO");
        maybe = new Button("MAYBE");    
    }

    public void add_components(){
        yes.setBounds(50,75,50,30);
        f.add(yes);
        no.setBounds(150,75,50,30);
        f.add(no);
        maybe.setBounds(250,75,50,30);
        f.add(maybe);
        l.setBounds(150,150,150,30);
        f.add(l);

        f.addWindowListener(this);
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand(); // IMPORTANT
        if (s.equals("YES")){
            msg = "You pressed " + s; 
        }
        else if (s.equals("NO")){
            msg = "You pressed " + s;
        }
        else if (s.equals("MAYBE")){
            msg = "You pressed " + s;
        }
        l.setText(msg);
        
    }

    public static void main(String[] args){
        new Lec3_HandlingButtons();
    }
}
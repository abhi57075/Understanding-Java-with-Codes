import java.awt.*;
import java.awt.event.*;

public class Lec9_TextField extends WindowAdapter implements ActionListener{
    Frame f;
    TextField name,password;
    Label l1,l2,l3,namel,passwordl;

    Lec9_TextField(){
        f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Handling Text Fields");
        f.setSize(400,400);
        init();
        add_components();
    }

    public void init(){
        name = new TextField(); // if we wrote name = new TextField(8) then while calling name.getText() only first 8 characters will be displayed
        password = new TextField();
        password.setEchoChar('*'); // IMPORTANT
        l1 = new Label();
        l2 = new Label();
        l3 = new Label();
        namel = new Label("NAME : ", Label.RIGHT);
        passwordl = new Label("PASSWORD : ", Label.RIGHT);
    }

    public void add_components(){
        namel.setBounds(20,50,60,40);
        f.add(namel);
        name.setBounds(90,50,100,40);
        f.add(name);

        passwordl.setBounds(250,50,100,40);
        f.add(passwordl);
        password.setBounds(370,50,100,40);
        f.add(password);

        l1.setBounds(50,100,300,30);
        l2.setBounds(50,140,300,30);
        l3.setBounds(50,180,300,30);
        f.add(l1);
        f.add(l2);
        f.add(l3);

        name.addActionListener(this);
        password.addActionListener(this);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void actionPerformed(ActionEvent e){
        l1.setText("Name : " + name.getText());
        l2.setText("Password : " + password.getText());
        l3.setText("Selected Text in name : " + name.getSelectedText());
    }

    public static void main(String args[]){
        new Lec9_TextField();
    }
}
import java.awt.*;
import java.awt.event.*;

public class Lec2_KeyboardEvents extends WindowAdapter implements KeyListener{
    Frame f;
    Label l;
    TextArea a;

    Lec2_KeyboardEvents(){
        f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Keyboard Handling events");
        init();
        add_components();
    }

    public void init(){
        l = new Label();
        a = new TextArea();
    }

    public void add_components(){
        l.setBounds(20,50,100,20);
        f.add(l);
        a.setBounds(20,80,300,300);
        f.add(a);
        
        f.addWindowListener(this);
        a.addKeyListener(this); // IMPORTANT
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }

    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }

    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }

    public static void main(String args[]){
        new Lec2_KeyboardEvents();
    }
}
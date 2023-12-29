import java.awt.*;
import java.awt.event.*;

public class Lec1_MouseHandlingEvents extends WindowAdapter implements MouseListener{
    Frame f;
    TextField tf;

    Lec1_MouseHandlingEvents(){
        f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Mouse Handling event program");
        init();
        add_components();
    }

    public void init(){
        tf = new TextField(50);
        tf.setBounds(20,50,100,20);
    }

    public void add_components(){
        f.add(tf);
        f.addWindowListener(this);
        f.addMouseListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public void mouseEntered(MouseEvent me){
        //tf.setForeground(Color.Cyan);
        tf.setText("MOUSE ENTERED");
        f.setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent me){
        //tf.setForeground(Color.Cyan);
        tf.setText("MOUSE EXITED");
        f.setBackground(Color.green);
    }

    public void mouseClicked(MouseEvent me){
        //tf.setForeground(Color.Cyan);
        tf.setText("MOUSE CLICKED");
        f.setBackground(Color.red);
    }

    public void mousePressed(MouseEvent me){
        //tf.setForeground(Color.Cyan);
        tf.setText("MOUSE Pressed");
        f.setBackground(Color.yellow);
    }

    public void mouseReleased(MouseEvent me){
        //tf.setForeground(Color.Cyan);
        tf.setText("MOUSE Released");
        f.setBackground(Color.pink);
    }

    public static void main(String args[]){
        new Lec1_MouseHandlingEvents();
    }
}

/*
Things to remember from this code :
We are using the windowAdapter class for - [] X (for minimizing, expanding and closing)
MouseListener is an interface which has 5 methods inside it : 
1. mouseClicked(MouseEvent me)
2. mouseEntered(MouseEvent me)
3. mouseExited(MouseEvent me)
4. mousePressed(MouseEvent me)
5. mouseReleased(MouseEvent me)
 */
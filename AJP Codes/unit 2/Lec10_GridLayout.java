import java.awt.*;
import java.awt.event.*;

public class Lec10_GridLayout extends WindowAdapter{
    Frame f;
    Font font;
    
    Lec10_GridLayout(){
        f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new GridLayout(4,4)); // Important
        f.setTitle("GRID LAYOUT DEMO");

        font = new Font("Arial",Font.BOLD,40);
        
        int num = 1;

        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if (num < 16){
                    String s = new String("" + num);
                    Button b = new Button(s);
                    b.setFont(font);
                    f.add(b);
                    num+=1;
                }
            }
        }

        f.addWindowListener(this);
    }

    public void windowClosing (WindowEvent e){
        f.dispose();
    }

    public static void main(String args[]){
        new Lec10_GridLayout();
    }
}
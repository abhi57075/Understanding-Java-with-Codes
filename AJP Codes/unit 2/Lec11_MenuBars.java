import java.awt.*;
import java.awt.event.*;

public class Lec11_MenuBars extends WindowAdapter{
    Frame f;
    MenuBar mb;
    Menu File, Edit, Special;
    MenuItem Cut, Copy, Paste, Debug, Testing, First, Second, Third;
    MenuItem Line;

    Lec11_MenuBars(){
         f = new Frame();
         f.setTitle("Menu Bar example");
         f.setLayout(null);
         f.setVisible(true);
         f.setSize(400,400);
         init();
         add_components();
    }

    public void init(){
        mb = new MenuBar();

        File = new Menu("File");
        Edit = new Menu("Edit");
        Special = new Menu("Special");

        Cut = new MenuItem("Cut");
        Copy = new MenuItem("Copy");
        Paste = new MenuItem("Paste");
        Special = new Menu("Special");
        Debug = new MenuItem("Debug");
        Testing = new MenuItem("Testing");
        First = new MenuItem("First");
        Second = new MenuItem("Second");
        Third = new MenuItem("Third");

        Line = new MenuItem("-");
    }

    public void add_components(){
        mb.add(File);
        mb.add(Edit);
        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);
        Edit.add(Line);
        Edit.add(Special);
        Edit.add(Debug);
        Edit.add(Testing);
        Special.add(First);
        Special.add(Second);
        Special.add(Third);

        f.setMenuBar(mb); // Important

        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e){
        f.dispose();
    }

    public static void main(String args[]){
        new Lec11_MenuBars();
    }
        
}
import java.awt.*;
import java.awt.event.*;

public class Lec14_StudentInformation extends WindowAdapter implements ActionListener, ItemListener{
    Frame f1,f2;
    Label f1l1, f1l2, f1l3, f1l4, f1l5, f1l6, f1l7, f1l8, f1l9, f1l10;
    Label f2l1, f2l2, f2l3, f2l4, f2l5, f2l6;
    Button b1,b2,b3;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    Choice c1,c2;

    Lec14_StudentInformation(){
        f1 = new Frame();
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setTitle("Student Marks");
        f1.setSize(400,400);
        init();
        add_components();
    }

    public void init(){
        f1l1 = new Label("Name : ");
        f1l2 = new Label("Roll no : ");
        f1l3 = new Label("Seat no : ");
        f1l4 = new Label("Department : ");
        f1l5 = new Label("Division : ");
        f1l6 = new Label("PM");
        f1l7 = new Label("CN");
        f1l8 = new Label("PDC");
        f1l9 = new Label("AJP");
        f1l10 = new Label("MP");

        f2l1 = new Label("Name : ");
        f2l2 = new Label("ROll no : ");
        f2l3 = new Label("Seat no : ");
        f2l4 = new Label("Department : ");
        f2l5 = new Label("Division : ");
        f2l6 = new Label("Average : ");

        b1 = new Button("Result");
        b2 = new Button("Cancel");
        b3 = new Button("Ok");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        t5 = new TextField(20);
        t6 = new TextField(20);
        t7 = new TextField(20);
        t8 = new TextField(20);

        c1 = new Choice();
        c2 = new Choice();
    }

    public void add_components(){
        f1l1.setBounds(20,50,100,20);
        f1l2.setBounds(20,80,100,20);
        f1l3.setBounds(20,110,100,20);
        f1l4.setBounds(20,140,100,20);
        f1l5.setBounds(20,170,100,20);

        f1l6.setBounds(20,200,50,20);
        f1l7.setBounds(80,200,50,20);
        f1l8.setBounds(140,200,50,20);
        f1l9.setBounds(200,200,50,20);
        f1l10.setBounds(260,200,50,20);

        t1.setBounds(150,50,150,20);
        t2.setBounds(150,80,150,20);
        t3.setBounds(150,110,150,20);

        c1.add("ENTC Engineering");
        c1.add("IT Engineering");
        c1.add("CS Engineering");

        c2.add("TE-V");
        c2.add("TE-VI");
        c2.add("TE-VII");
        c2.add("TE-VIII");

        c1.setBounds(150,140,150,20);
        c2.setBounds(150,170,150,20);

        t4.setBounds(20,230,50,20);
        t5.setBounds(80,230,50,20);
        t6.setBounds(140,230,50,20);
        t7.setBounds(200,230,50,20);
        t8.setBounds(260,230,50,20);

        b1.setBounds(20,260,150,30);
        b2.setBounds(200,260,150,30);

        f1.add(f1l1);
        f1.add(f1l2);
        f1.add(f1l3);
        f1.add(f1l4);
        f1.add(f1l5);
        f1.add(f1l6);
        f1.add(f1l7);
        f1.add(f1l8);
        f1.add(f1l9);
        f1.add(f1l10);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(c1);
        f1.add(c2);
        f1.add(t4);
        f1.add(t5);
        f1.add(t6);
        f1.add(t7);
        f1.add(t8);
        f1.add(b1);
        f1.add(b2);

        f1.addWindowListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void windowClosing(WindowEvent e){
        f1.dispose();
    }

    public void itemStateChanged(ItemEvent e){

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            f2 = new Frame();

            f1.setVisible(false);

            f2.setLayout(null);
            f2.setSize(500,500);
            f2.setTitle("Message");

            f2.setVisible(true);

            f2l1.setText("Name : " + t1.getText());
            f2l2.setText("Roll no : " + t2.getText());
            f2l3.setText("Seat no : " + t3.getText());
            f2l4.setText("Department : " + c1.getSelectedItem());
            f2l5.setText("Division : " + c2.getSelectedItem());
            
            f2l1.setBounds(20,50,500,30);
            f2l2.setBounds(20,90,500,30);
            f2l3.setBounds(20,130,500,30);
            f2l4.setBounds(20,170,500,30);
            f2l5.setBounds(20,210,500,30);
            f2l6.setBounds(20,250,500,30);

            b3.setBounds(60,300,100,50);
            f2.add(b3);

            Integer m1 = Integer.parseInt(t4.getText());
            Integer m2 = Integer.parseInt(t5.getText());
            Integer m3 = Integer.parseInt(t6.getText());
            Integer m4 = Integer.parseInt(t7.getText());
            Integer m5 = Integer.parseInt(t8.getText());

            Integer avg = (m1+m2+m3+m4+m5)/5;

            f2l6.setText("Average : " + avg.toString());

            f2.add(f2l1);
            f2.add(f2l2);
            f2.add(f2l3);
            f2.add(f2l4);
            f2.add(f2l5);
            f2.add(f2l6);

        }
        else if (e.getSource() == b2){
            f1.dispose();
        }
        else if (e.getSource() == b3){
            f2.setVisible(false);
            f1.setVisible(true);
        }
    }

    public static void main(String args[]){
        new Lec14_StudentInformation();
    }
}
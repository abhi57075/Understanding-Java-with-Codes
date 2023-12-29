import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main extends WindowAdapter implements ActionListener,
ItemListener
{
 JFrame frame;
 JLabel name, roll_no, seat_no, dept, div, sub1, sub2, sub3, sub4, sub5;
 JTextField tf_name, tf_roll_no, tf_seat_no, tf_sub1, tf_sub2, tf_sub3, tf_sub4,
tf_sub5;
 JComboBox cb_dept, cb_div;
 JButton res, cancel;
 Main()
 {
 frame = new JFrame("Student Marks");
 init();
 add_components();
 frame.setSize(400, 400);
 frame.setLayout(null);
 frame.setVisible(true);
 }
 public void init()
 {
 name = new JLabel("Name: ");
 roll_no = new JLabel("Roll No.: ");
 seat_no = new JLabel("Seat No.: ");
 dept = new JLabel("Department: ");
 div = new JLabel("Division");
 sub1 = new JLabel("PM");
 sub2 = new JLabel("CN");
 sub3 = new JLabel("PDC");
 sub4 = new JLabel("AJP");
 sub5 = new JLabel("MP");
 tf_name = new JTextField();
 tf_roll_no = new JTextField();
 tf_seat_no = new JTextField();
 tf_sub1 = new JTextField();
 tf_sub2 = new JTextField();
 tf_sub3 = new JTextField();
 tf_sub4 = new JTextField();
 tf_sub5 = new JTextField();
 String[] departments = {"CS Engineering", "IT Engineering", "EnTC Engineering"};
 cb_dept = new JComboBox(departments);
 String[] division = {"TE-V", "TE-VI", "TE-VII", "TE-VIII"};
 cb_div = new JComboBox(division);
 res = new JButton("Result");
 cancel = new JButton("Cancel");
 }
 public void add_components()
 {
 name.setBounds(20, 20, 100, 30);
 frame.add(name);
 tf_name.setBounds(120, 20, 150, 30);
 frame.add(tf_name);
 roll_no.setBounds(20, 60, 100, 30);
 frame.add(roll_no);
 tf_roll_no.setBounds(120, 60, 150, 30);
 frame.add(tf_roll_no);
 seat_no.setBounds(20, 100, 100, 30);
 frame.add(seat_no);
 tf_seat_no.setBounds(120, 100, 150, 30);
 frame.add(tf_seat_no);
 dept.setBounds(20, 140, 100, 30);
 frame.add(dept);
 cb_dept.setBounds(120, 140, 150, 30);
 frame.add(cb_dept);
 div.setBounds(20, 180, 100, 30);
 frame.add(div);
 cb_div.setBounds(120, 180,150, 30);
 frame.add(cb_div);
 sub1.setBounds(20, 220, 70, 30);
 frame.add(sub1);
 tf_sub1.setBounds(15, 240, 50, 30);
 frame.add(tf_sub1);
 sub2.setBounds(90, 220, 70, 30);
 frame.add(sub2);
 tf_sub2.setBounds(85, 240, 50, 30);
 frame.add(tf_sub2);
 sub3.setBounds(160, 220, 70, 30);
 frame.add(sub3);
 tf_sub3.setBounds(155, 240, 50, 30);
 frame.add(tf_sub3);
 sub4.setBounds(230, 220, 70, 30);
 frame.add(sub4);
 tf_sub4.setBounds(225, 240, 50, 30);
 frame.add(tf_sub4);
 sub5.setBounds(300, 220, 70, 30);
 frame.add(sub5);
 tf_sub5.setBounds(295, 240, 50, 30);
 frame.add(tf_sub5);
 res.setBounds(70, 300, 100, 30);
 frame.add(res);
 cancel.setBounds(180, 300, 100, 30);
 frame.add(cancel);
 cb_dept.addItemListener(this);
 cb_div.addItemListener(this);
 res.addActionListener(this);
 cancel.addActionListener(this);
 }
 public void windowClosing(WindowEvent e)
 {
 frame.dispose();
 }
 public void actionPerformed(ActionEvent e)
 {
 String name = tf_name.getText();
 String roll_no = tf_roll_no.getText();
 String seat_no = tf_seat_no.getText();
 String dept = cb_dept.getSelectedItem().toString();
 String div = cb_div.getSelectedItem().toString();
 int sub1 = Integer.parseInt(tf_sub1.getText());
 int sub2 = Integer.parseInt(tf_sub2.getText());
 int sub3 = Integer.parseInt(tf_sub3.getText());
 int sub4 = Integer.parseInt(tf_sub4.getText());
 int sub5 = Integer.parseInt(tf_sub5.getText());
 int percent = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
 if (e.getSource() == res)
 {
 String msg = "Name: " + name + "\nRoll No.: " + roll_no + "\nSeat No.: " + seat_no
+ "\nDepartment: " + dept + "\nDivision: " + div + "\nPercentage: " + percent;
 frame.setVisible(false);
 JOptionPane.showMessageDialog(frame, msg);
 frame.setVisible(true);
 }
 else if (e.getSource() == cancel)
 {
 frame.dispose();
 }
 }
 public void itemStateChanged(ItemEvent e) {}

 public static void main(String[] args)
 {
 new Main();
 }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class D1 extends JFrame
{
Container c;
JButton b1,b2,b3,b4;

D1()
{
c=getContentPane();

c.setLayout(new FlowLayout());

b1=new JButton("Add");
b2=new JButton("View");
b3=new JButton("Update");
b4=new JButton("Delete");

c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);

b1.addActionListner(new ActionListener() {
public void actionPerformed(ActionEvent ae) {

}

public static void main(String args[])
{
D1 d=new D1();
d.setSize(200,200);
d.setTitle("Management System");
d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
d.setVisible(true);
}
}
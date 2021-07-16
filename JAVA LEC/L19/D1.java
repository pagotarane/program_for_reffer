import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class D1 extends JFrame
{
Container c;
JButton btnClickMe;
D1()
{
c=getContentPane();
c.setLayout(new FlowLayout());
btnClickMe=new JButton("Click Me");
c.add(btnClickMe);

btnClickMe.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
JOptionPane.showMessageDialog(c,"Happy Dasara");
}
});
}
public static void main(String args[])
{
D1 d=new D1();
d.setLocation(300,200);
d.setSize(400,200);
d.setTitle("First App");
d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
d.setVisible(true);
}
}
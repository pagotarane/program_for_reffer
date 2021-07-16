package pa;
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
btnClickMe=JButton("Click Me");
c.add(btnClickMe);

ActionListner a1=(ae)->{
JOptionPane.showMessageDialog(c,"WElCOME TO MY APP");
};
btnClickMe.addActionListener(a1);

setSixe(400,200);
setLocationRelativeTo(null);
setTitle("GUI App");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[])
{
D1 d=new D1();
}
}

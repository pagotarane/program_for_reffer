package pa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class D1 extends JFrame
{
Container c;
JButton btnDateTime;

D1()
{
c=getContentPane();
c.setLayout(new FlowLayout());
btnDateTime = new JButton("Date and Time App");
c.add(btnDateTime);

ActionListener a1=(ae) -> {
Date d=new Date();
JOptionPane.showMessageDialog(c, "date and time= " +d);
};
btnDateTime.addActionListener(a1);

setSize(300,100);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[])
{
D1 d=new D1();
}
}
package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Eo extends JFrame
{
Container c;
JLabel lblNumber;
JTextField txtNumber;
JButton btnFind;

Eo()
{
c=getContentPane();
c.setLayout(new FlowLayout());
lblNumber=new JLabel("enter number");
txtNumber=new JTextField(15);
btnFind=new JButton("Find");

c.add(lblNumber);
c.add(txtNumber);
c.add(btnFind);

btnFind.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
try{
String s=txtNumber.getText();
int num=Integer.parseInt(s);
String res="";
if(num%2==0)	res="Even";
else		res="Odd";
JOptionPane.showMessageDialog(c,res);
}
catch(NumberFormatException nfe){
JOptionPane.showMessageDialog(c,"Integeres only");
txtNumber.setText("");
txtNumber.requestFocus();
return;
}
}
});
setTitle("E O Finder");
setSize(400,200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public static void main(String args[])
{
Eo e=new Eo();
}
}

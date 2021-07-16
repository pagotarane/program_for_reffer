
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user1 extends JFrame{
		
	private JPanel panel;
	private JTextField textfield;
	private JPasswordField passwordfield;
	private JButton b1,b2,b3;
	public Login_user1() 
	{
		setLayout(null);
		setBackground(new Color(169,169,169));
		setBounds(600,300,600,400);
		
		panel=new JPanel();
		panel.setBackground(new Color(176,224,230));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel l1=new JLabel("UserName : ");
		l1.setBounds(124,124,95,24);
		panel.add(l1);
		
		textfield=new JTextField();
		textfield.setBounds(210,128,157,20);
		panel.add(textfield);
		
		JLabel l2=new JLabel("Password : ");
		l2.setBounds(124,154,95,24);
		panel.add(l2);
		
		textfield=new JTextField();
		textfield.setBounds(210,158,157,20);
		panel.add(textfield);
		
		b1=new JButton("Login");
		b1.addActionListener(this);
		
		b1.setForeground(new Color(46,139,97));
		b1.setBackground(new Color(250,250,210));
		b1.setBounds(149,201,113,39);
		panel.add(b1);
		
		b2=new JButton("SignUp");
		b2.addActionListener(this);
			
			b2.setForeground(new Color(46,139,97));
			b2.setBackground(new Color(250,250,210));
			b2.setBounds(299,201,113,39);
			panel.add(b2);
			
			b3=new JButton("Forgot Password");
			b3.addActionListener(this);
				
			b3.setForeground(new Color(205,92,92));
			b3.setBackground(new Color(253,245,230));
			b3.setBounds(199,251,179,39);
			panel.add(b3);
			
			JLabel l3=new JLabel("Trouble in Login?");
			l3.setFont(new Font("Tahoma",Font.PLAIN,15));
			l3.setForeground(new Color(255,0,0));
			l3.setBounds(70,240,130,201);
			panel.add(l3);
	}
		public static void main(String args[])
		{
		Login_user1 d=new Login_user1();
		d.setLocation(300,200);
		d.setSize(600,450);
		d.setTitle("Library Managemant System");
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setVisible(true);
		}
	}

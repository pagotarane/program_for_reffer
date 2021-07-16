package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login_user extends JFrame{
		
	private JPanel panel;
	private JTextField textfield;
	private JPasswordField passwordfield;
	private JButton b1,b2,b3;
	public Login_user() 
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
//		b1.addActionListener(this);
		
		
		b1.setForeground(new Color(46,139,97));
		b1.setBackground(new Color(250,250,210));
		b1.setBounds(149,201,113,39);
		panel.add(b1);
		
		b2=new JButton("SignUp");
		//b2.addActionListener((ActionListener) this);// test 
			
			b2.setForeground(new Color(46,139,97));
			b2.setBackground(new Color(250,250,210));
			b2.setBounds(299,201,113,39);
			panel.add(b2);
			
			b3=new JButton("Forgot Password");
			//b3.addActionListener((ActionListener) this);
				
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
	
/*	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) 
		
		{
			Boolean status=false;
			
			try {
				
				Conn con=new Conn();
			String sql="select * from account where username=? and password=?";
			PreparedStatement st=con.c.prepareStatement(sql);
			
			st.setString(1, textfield.getText());
			st.setString(2, passwordfield.getText());
			
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				this.setVisible(false);
				//new Loading().setVisible(true);
				
			}else
				JOptionPane.showMessageDialog(null, "Invalid Login");
				
			} catch (Exception e2)
			{
				e2.printStackTrace();
			}
			
			}			
		}*/

	
	
	
		public static void main(String args[])
		{
			
					Login_user d=new Login_user();
					d.setLocation(300,200);
					d.setSize(600,450);
					d.setTitle("Library Managemant System");
					d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					d.setVisible(true);
					
		
		
		}
	}

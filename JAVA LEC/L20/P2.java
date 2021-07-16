import java.io.*;
import java.sql.*;

class P2
{
public static void main(String args[])
{
Console c=System.console();

try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.print("Connected");

String  s1="insert into employee values(?,?)";
PreparedStatement s2=con.prepareStatement(s1);

int eid=Integer.parseInt(c.readLine("enter emp id "));
String name=c.readLine("enter emp name ");

s2.setInt(1,eid);
s2.setString(2,name);

int r1=s2.executeUpdate();
System.out.println(r1 + "records inserted ");

con.close();
System.out.println("DisConnected");
}
catch(SQLException se)
{
System.out.println("issue"+se);
}
}
}

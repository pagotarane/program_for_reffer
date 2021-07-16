// wap to perform cnxm and discnxn

import java.sql.*;

class P1
{
public static void main(String args[])
{
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.print("Connected");

con.close();
System.out.println("DisConnected");
}
catch(SQLException se)
{
System.out.println("issue"+se);
}
}
}

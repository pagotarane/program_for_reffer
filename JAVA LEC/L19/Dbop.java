import java.sql.*;
class Dbop
{
public static void main(String args[])
{
try
{
System.out.println("loading the driver");
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

System.out.println("driver loaded");

System.out.println("trying to connect");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("trying to disconnect");

con.close();
System.out.println("disconnect");
}
catch(SQLException se)
{
System.out.println("issue"+se);
}
}
}
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
class Db
{
public static void main(String args[])
{
try
{
System.out.println("Loading the Driver");

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
System.out.println("trying to connect");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");

System.out.println("Connected");

con.close();
System.out.println("disconnect");
}
catch(SQLException se)
{
System.out.println("issue"+se);
}
}
}

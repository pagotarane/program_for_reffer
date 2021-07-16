
import java.sql.*;

public class MysqlConn {
	public static void main(String args[])
	{
	//public MysqlConn(){
	try	{
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/2_may","root","admin");
	
		System.out.println("Connected");
		}
		catch(Exception e) {
			
		System.out.println(e);
		}
	}
}
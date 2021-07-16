import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation3{
public static void main(String args[]){
Configuration cfg= new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;
Transaction t=null;
try{
session = factory.openSession();
System.out.println("session open");

t=session.beginTransaction();
Console c=System.console();
int eid=Integer.parseInt(c.readLine("Enter Eid"));
Employee e=(Employee)session.get(Employee.class,eid);
if (e!=null)
{
String ename=c.readLine("Enter new name ");
e.setEname(ename);
session.save(e);
t.commit();
System.out.println("Record updated");
}
else{
System.out.println("Emp Doesnot exist ");
}
}
catch(Exception e)
{
System.out.println("issue "+e);
t.rollback();
}
finally
{
session.close();
System.out.println("session closed");
}
}
}

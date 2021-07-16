// wap for Employee

import java.io.*;
class Employee
{
private int eid;
private String ename;
private double esalary;

public Employee (int eid,String ename,double esalary)
{
this.eid=eid;
this.ename=ename;
this.esalary=esalary;
}
public void showInfo()
{
System.out.println(eid+" "+ename+" "+esalary);
}
}


class EmployeeTest
{
public static void main(String args[])
{
Console c = System.console();
int n=Integer.parseInt(c.readLine("Enter number of Employee"));

Employee[] e = new Employee[n];

for(int i=0;i<n;i++)
{
int eid=Integer.parseInt(c.readLine("Enter Eid"));
String ename=c.readLine("Enter E name");
double esalary=Double.parseDouble(c.readLine("Enter E Salary"));
e[i]=new Employee(eid,ename,esalary);
}

for (Employee m:e)
  	m.showInfo();
}
} 


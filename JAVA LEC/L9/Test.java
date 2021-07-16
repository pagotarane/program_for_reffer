import java.io.*;
class Person
{
private int id;
private String name;
private String address;

public int getId()
{
return id;
}

public void setId(int id)
{
if(id<0)
throw new IllegalArgumentException("Id cannot be negative");
this.id=id;
}

public String getName()
{
return name;
}

public void setName(String name)
{
if(name.length()<2)
throw new IllegalArgumentException("name should be atleast 2 letters");
this.name=name;
}

public String getAddress()
{
return address;
}

public void setAddress(String address)
{
if(address.length()<2)
throw new IllegalArgumentException("address should be atleast 2 letters");
this.address=address;
}
}

class Employee extends Person
{
private double salary;
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
if(salary<5000)
throw new IllegalArgumentException("salary cannot be less than 5000");
this.salary=salary;
}
}
class SalesPerson extends Employee
{
private double comm;

public double getComm()
{
return comm;
}

public void setComm(double comm)
{
if(comm<0)
throw new IllegalArgumentException("comm cannot be less than 0");
this.comm=comm;
}
}

class Test
{
public static void main(String args[])
{

Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter No. of Employees"));
SalesPerson sp[]=new SalesPerson[n];
for(int i=0;i<n;i++)
{
sp[i]=new SalesPerson();
int id=Integer.parseInt(c.readLine("Enter Id "));
sp[i].setId(id);
String name=c.readLine("Enter Name ");
sp[i].setName(name);
String address=c.readLine("Enter Address ");
sp[i].setAddress(address);
double salary=Double.parseDouble(c.readLine("Enter Salary "));
sp[i].setSalary(salary);
double comm=Double.parseDouble(c.readLine("Enter Comm "));
sp[i].setComm(comm);
}
for(int i=0;i<n;i++)
System.out.println(sp[i].getId() + " " + sp[i].getName() +" "+ sp[i].getAddress() + " " + sp[i].getSalary() + " " + sp[i].getComm());
}
}

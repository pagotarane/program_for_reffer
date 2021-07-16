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
if(name.length()<2 )
throw new IllegalArgumentException("Name should be atleast 2 chgaracters");
this.name=name;
}

public String getAddress()
{
return address;
}
public void setAddress(String address)
{
if(address.length()<2)
throw new IllegalArgumentException("Address should be atleast 2 characters");
this.address=address;
}
}


class Employee extends Person
{
double salary;
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
if(salary<5000)
throw new IllegalArgumentException("Salary should not be less than 5000");
this.salary=salary;
}
}
class Test123
{
public static void main(String args[])
{
Console c=System.console();

int n=Integer.parseInt(c.readLine("Enter no of Employees "));
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
e[i]=new Employee();
int id=Integer.parseInt(c.readLine("Enter Id "));
e[i].setId(id);
String name=c.readLine("Enter Name ");
e[i].setName(name);
String address=c.readLine("Enter Address ");
e[i].setAddress(address);
double salary=Double.parseDouble(c.readLine("Enter Salary "));
e[i].setSalary(salary);
}
for(int i=0;i<n;i++)	
System.out.println(e[i].getId() +" " + e[i].getName() +" " + e[i].getAddress() + " "+ e[i].getSalary());
}
}

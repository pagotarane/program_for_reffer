import java.util.*;
class Emp implements Comparable<Emp>
{
String name;
String location;
double salary;

Emp(String name,String location,double salary)
{
this.name=name;		this.location=location;	this.salary=salary;
}
public int compareTo(Emp e)
{
return(int)(salary-e.salary);
}
}

class MySort2
{
public static void main(String args[])
{
Emp e1=new Emp("Summet","Thane",50000);
Emp e2=new Emp("Omkar","Andheri",40000);
Emp e3=new Emp("Amol","Wada",45000);
Emp e4=new Emp("Ketan","Thane",30000);

ArrayList<Emp>e=new ArrayList<Emp>();
e.add(e1);
e.add(e2);
e.add(e3);
e.add(e4);

Collections.sort(e);

System.out.println("Sorted List :");
for(Emp e10:e)
{
System.out.println(e10.name + "   " +e10.location + "     " + e10.salary);
}
}
}
class Student
{
private static String sir_name = "GR8 KAMAL";
private int rno;
private String name;
private int sub1,sub2,sub3;

public void setData(int rno,String name, int p,int c,int m)
{
	this.rno=rno;
	this.name=name;
	sub1=p;
	sub2=c;
	sub3=m;
}
public void showData()
{
	System.out.println(rno+" "+name+" "+sub1+" "+sub2+" "+sub3+" "+sir_name);
}
}

class StudentTest1 
{
public static void main(String args[])
{
Student s1=new Student();
int rno=Integer.parseInt(args[0]);
String name = args[1];
int sub1=Integer.parseInt(args[2]);
int sub2=Integer.parseInt(args[3]);
int sub3=Integer.parseInt(args[4]);

s1.setData(rno,name,sub1,sub2,sub3);
s1.showData();
}
}

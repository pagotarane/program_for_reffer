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

class StudentTest 
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData(10,"Shekhar",98,68,82);
s1.showData();
Student s2=new Student();
s2.setData(20,"sushant",99,55,71);
s2.showData();
}
}
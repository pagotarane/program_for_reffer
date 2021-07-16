class Student 
{
private static String sir_name= "KAMAL";
private int rno;
private String name;
private int sub1,sub2,sub3;

public void setData(int rno,String name,int p,int c,int m)
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
s1.setData(10,"ketan",90,89,78);
s1.showData();
Student s2=new Student();
s2.setData(11,"Mahesh",89,78,79);
s2.showData();
}}
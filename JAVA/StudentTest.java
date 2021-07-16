//OOP progam for student
class Student
{
private int rno;
private String name;

public void setData(int r,String n)
{
rno =r;
name =n;
}
public void showData()
{
System.out.println("rno "+rno +"name "+name);
}
}
class StudentTest
{
public static void main(String args[])
{
Student s1=new Student();	s1.setData(10, " Amit");	s1.showData();
Student s2=new Student();	s2.setData(20, " Ketan");	s2.showData();
}
}
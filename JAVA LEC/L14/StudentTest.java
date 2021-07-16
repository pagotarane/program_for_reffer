class Student
{
private static int count;
private int rno;
private String name;

public Student(int rno,String name)
{
this.rno=rno;
this.name=name;
}

public String toString()
{
return rno + " " + name;
}

public void finalize()
{
count++;
}

public static void showCount()
{
System.out.println(count);
}
}

class StudentTest
{
public static void main(String args[])
{
Student s1=new Student(10,"Amit");
Student s2=new Student(11,"Ketan");
Student s3=new Student(12,"Shekhar");
Student s4=new Student(13,"Sanju");
System.out.println(s1.toString());
System.out.println(s2.toString());
System.out.println(s3.toString());
System.out.println(s4.toString());

s2=s1;
s3=s1;
s4=s1;
System.gc();
Student.showCount();
}
}
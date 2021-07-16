class Person
{
int id;
String name;
String address;

Person(int id,String name,String address)
{
this.id=id;
this.name=name;
this.address=address;
}
void showinfo()
{
System.out.println(id + "" +name+ "" +address);
}
}
class Student extends Person
{
int marks;
Student(int id,String name,String address,int marks)
{
super(id,name,address);
this.marks=marks;
}
void showdetails()
{
super.showinfo();
System.out.println(id + "" +name+ "" +address +"" +marks);
}
}
class Test
{
public static void main(String args[])
{
Student s=new Student(10,"Amit","Mumbai",80);
s.showdetails();
}
}


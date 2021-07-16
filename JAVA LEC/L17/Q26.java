public class Parent
{
protected void sayHi()
{
System.out.println("hi");
}
}
class Child extends Parent
{
void sayHi()
{
System.out.println("hello");
}
}
class Q26
{
public static void main(String args[])
{
Parent p=new Child();
p.sayHi();
}
}
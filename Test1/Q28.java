class MyClass
{
static int i=5;
static int j=7;
public static void printSomething()
{
System.out.println("i:" +i);
System.out.println("j:" +j);
}
}
class Q28
{
public static void main(String args[])
{
MyClass m= new MyClass();
m.printSomething();
}
}
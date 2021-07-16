class Overloading{
void x(int i)
{
System.out.println("one");
}
void x(String s)
{
System.out.println("Two");
}
void x(double d)
{
System.out.println("Three");
}
}
class Overload
{
public static void main(String args[])
{
new Overloading().x(4);
}
}


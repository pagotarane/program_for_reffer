interface A
{
int add(int a,int b);
}
class B implements A
{
public int add(int a,int b)
{
return a+b;
}
}
class Demo
{
public static void main(String args[])
{
B b=new B();
int r1=b.add(10,20);
System.out.println(r1);

A a=(p1,p2) -> p1+p2;
int r2=a.add(10,20);
System.out.println(r2);

A c=(int p1,int p2) -> { return p1+p2; };
int r3=a.add(10,20);
System.out.println(r2);



}
}
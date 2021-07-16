class Pass1
{
public static void main(String args[])
{
int x=5;
Pass1 p=new Pass1();
p.doStuff(x);
System.out.println("main x= "+x);
}
void doStuff(int x)
{
System.out.print("dostuff x= "+ x++);
}
}
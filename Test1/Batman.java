class  Batman 
{
int square=91;
public static void main(String args[])
{
new Batman().go();
}
void go()
{
incr(++square);
System.out.println(square);
}
void incr(int square)
{
square+=10;
}
}
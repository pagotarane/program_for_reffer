class Test87
{
int squares=81;
public static void main(String[] args)
{
new Test87().go();
}
void go()
{
incr(++squares);
System.out.println(squares);
}
void incr(int squares)
{
squares+=10;
return;
}
}
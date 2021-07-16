class Q24
{
public static void main(String args[])
{
boolean keepGoing=true;
int i=9;
do
{
i--;
if(i==30)
{
keepGoing=false;
}
result<<=1;
}
while(keepGoing);
System.out.println(result);
}
}
class Palindrome
{
public static void  main(String args[])
{
int rev=0,digit=0,num=575,temp;
temp=num;
do
{
	digit=num%10;
	rev=rev*10+digit;
	num=num/10;
}
while(num>0);
{
System.out.println(""+rev);
}
if (temp==rev)
{
System.out.println("No. is Palindrome");
}
else
{
System.out.println("No. is not Palindrome");
}

}}
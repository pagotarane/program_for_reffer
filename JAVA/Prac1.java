//wap using while loop to find the sum of n positive integeres
class Prac1
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
if(num<0)
System.out.println("b +ve");
else
{
int sum=0,i=1;
while(1<=num)
{
sum=sum+1;
i=i+1;
}
System.out.println("sum= " +sum);
}
}
}
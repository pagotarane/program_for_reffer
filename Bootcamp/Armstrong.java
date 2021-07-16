import java.io.*;
class Armstrong 
{
public static void main(String args[])
	{
		int number,temp,sum=0,n;
		Console c=System.console();
		number=Integer.parseInt(c.readLine("Enter the Number "));
		int len=Integer.toString(number).length();
		System.out.println(len);
		temp=number;
		while(number>0)
		{
			n=number%10;
			sum=sum+power(n,len);
			number=number/10;	
		}
		if(temp==sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	}
public static int power(int base,int exponent)
{
	int result=1;
	for(int i=1;i<=exponent;i++)
	{
		result=result*base;	
	}
	return result;
}	
}
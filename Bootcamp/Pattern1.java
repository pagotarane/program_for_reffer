import java.util.*;
class Pattern1
{
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number of * ");
	int n=scanner.nextInt();
	for(int i=1;i<=n;i+=2)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	System.out.println();
}
}
}

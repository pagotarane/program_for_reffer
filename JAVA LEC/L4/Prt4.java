//wap to print full using for loop


class Prt4
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if (num < 0)
    System.out.println("b+ ve");
else
{ 
for (int i=1; i<= num;i++)
{
 	for (int j=1;j<=i;j++)
	{
		System.out.print("*\t");
	}
	System.out.println();
}

}
}
} 
     
     
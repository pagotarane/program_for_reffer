
class Pattern
{
public static void main(String args[])
{
	int i,j,row=5;
	for(i=1;i<=row;i+=2)
	{
		for(j=1;j<=row-i;j++)
		{
			System.out.print("*");
		}
	}
	

}
}
import java.util.*;
class SameArray1
{
public static boolean equals(int a1[],int a2[])
{
	int n=a1.length;
	int m=a2.length;
	
	if(n!=m)
	{
		return false;
	}
	Arrays.sort(a1);
	Arrays.sort(a2);
	for (int i = 0; i < n; i++) 
	{
            if (a1[i] != a2[i]) 
                return false; 
  	} 
        return true; 
    } 

public static void main(String args[])
{
	int i,j;
	int a1[]=new int[50];
	int a2[]=new int[50];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of 1st Array :");
	int size1=scanner.nextInt();
	
	System.out.println("Enter the Elements in 1st Array :");
	for(i=0;i<size1;i++)
	{
		a1[i]=scanner.nextInt();	
	}
	System.out.println("Enter the size of 2nd Array :");
	int size2=scanner.nextInt();

	System.out.println("Enter the Elements in 2nd Array :");
	for(i=0;i<size2;i++)
	{
		a2[i]=scanner.nextInt();	
	}
	for(i=0;i<size1;i++)
	{
		System.out.print(a1[i]+" ");
	}
	System.out.println();
	for(i=0;i<size2;i++)
	{	
		System.out.print(a2[i]+" ");
	}
	
		if(equals(a1,a2))
		{
			System.out.println("Arrays are equal ");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	
}
}
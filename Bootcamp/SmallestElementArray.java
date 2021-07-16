import java.util.*;
public class SmallestElementArray
{
   public static void main(String args[])
   {
	int small,size,i;
	int arr[]=new int[50];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size of Array :");
	size=scanner.nextInt();
	System.out.println("Enter Array Elements :");
	for(i=0;i<size;i++)
	{
		arr[i]=scanner.nextInt();
	}
	small=arr[0];
       for(i=0; i<size; i++)
       {
           if(small > arr[i])
           {
               small = arr[i];
           }
           
       }
	   
       System.out.print("Smallest Element = " + small); 
   }
}
import java.util.*;
class SecondLarge
{
public static void main(String[] args)
{
	int arr[]=new int[50];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int size=scanner.nextInt();
	
	System.out.println("Enter the Elements in Array :");
	for(int i=0;i<size;i++)
	{
		arr[i]=scanner.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
		
		int largest = arr[0];
		int secondLargest = arr[0];
		

		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}
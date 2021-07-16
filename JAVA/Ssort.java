import java.io.*;
class Ssort
{
public static void main(String args[])
{
Console c=System.console();
int size,i,j,temp;
int arr[]=new int[50];
System.out.println("Enter Array size");

size=Integer.parseInt(c.readLine());

System.out.println("Enter Array Elements");
i=Integer.parseInt(c.readLine());

for(i=0;i<size;i++)
{
arr[i]=Integer.parseInt(c.readLine());
}

System.out.println("Sorting Array using Selection Sort ");
for(i=0;i<size;i++)
{
for(j=0;j<size;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Now the Array after sorting \n");
for(i=0;i<size;i++)
{
System.out.print(arr[i]);
}
}
}

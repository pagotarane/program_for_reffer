class Bubblesort
{
public static void main(String args[])
{
int arr[]={3,60,45,21,320,2};
int temp=0;
for(int i=0;i<arr.length;i++)
{
for(int j=1;j<arr.length;j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("MIN "+arr[0]+" MAX "+arr[arr.length-1]);

}

}
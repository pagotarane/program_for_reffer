class ArrayMax2
{
public static void main(String args[])
{
int[] a=new int[] {20,30,40,10,25,-1};
int max=a[0];
int min=a[0];

for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("Largest "+max);
System.out.println("Smallest "+min);
}
}


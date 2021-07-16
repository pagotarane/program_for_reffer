class Array1
{
public static void main(String rags[])
{
int[] a=new int[] {0,0,0,0,-1};
int min=a[0];
int max=a[0];

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
System.out.println("Largest= "+max);
System.out.println("Smallest= "+min);
}
}
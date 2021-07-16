class AS
{
public static void main(String args[])
{
int[] a={5,3,1,8,-1};
int min=a[0];
int max=a[0];

for(int d=0;d<a.length;d++)
{
if(a[d]>max)
{
max=a[d];
}
if(a[d]<min)
{
min=a[d];
}
}
System.out.println("MAX= "+max + " "+"MIN= "+min);

}
}
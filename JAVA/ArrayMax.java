class ArrayMax
{
static int arr[]={10,24,45,-1,100};

static int largest()
{
int i;
int max=arr[0];
for(i=1;i<arr.length;i++)
if(arr[i]>max)
max=arr[i];
return max;
}
static int smallest()
{
int i;
int min=arr[0];
for(i=1;i<arr.length;i++)
if(arr[i]<min)
min=arr[i];
return min;
}
public static void main(String args[])
{
System.out.println("Largest Number: "+largest());
System.out.println("Largest Number: "+smallest());
}
}
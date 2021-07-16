import java.util.HashSet;
class ArrayDup1
{
public static void main(String args[])
{
int[] a= {1,2,3,4,2,1};

HashSet<Integer> d=new HashSet<Integer>();
for(int data:a)
{
if(!d.add(data))
{
System.out.println("Dup :"+data);
}
}
}}
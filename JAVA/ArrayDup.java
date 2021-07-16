import java.util.HashSet;
class ArrayDup
{
public static void main(String args[])
{
String[] a= {"java","android","python","java"};

HashSet<String> set=new HashSet<String>();
for(String b:a)
{
if(!set.add(b))
{
System.out.println("Duplicates "+b);
}
}
}
}
// wap to read two integers from CLA and find min of 2

class Prt1
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int min ;

if (n1<n2)
      min = n1;
else 
       min = n2;
System.out.println("Minimum number is:" +min);

}
}
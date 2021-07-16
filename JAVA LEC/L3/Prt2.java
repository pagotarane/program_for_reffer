//wap to read three integer from CLA and find max of three

class Prt2
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int n3=Integer.parseInt(args[2]);

if (n1>n2 && n1>n3)
      
System.out.println("Maximum number is:" +n1);

else 
if (n2>n1 && n2>n3)
      
System.out.println("Maximum number is:" +n2);

else 

System.out.println("Maximum number is:" +n3);
}
}
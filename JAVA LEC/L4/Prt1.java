//wap using while loop to find the sum of
//find n positive integer

class Prt1
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if (num < 0)
    System.out.println("b+ ve");
else
{  
     int sum=0, i=1;
     while (i<=num)
     {
        sum= sum+i;
        i=i+1;
     }
     System.out.println("sum = "+sum);
}
}
}
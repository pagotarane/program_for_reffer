//wap using while loop to find the sum of the digit


class Prt2
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if (num < 0)
    System.out.println("b+ ve");
else
{  
     int sum=0, digit = 0;
     while (num > 0)
     {
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
     }
     System.out.println("sum = "+sum);
}
}
}
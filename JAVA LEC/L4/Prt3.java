//wap using do while loop to find the reverse of the  given number


class Prt3
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if (num < 0)
    System.out.println("b+ ve");
else
{  
     int rev=0, digit = 0;
     do
     {
        digit = num % 10;
        rev = rev*10 + digit;
        num = num / 10;
     }  
    while (num > 0);
     System.out.println("rev = "+rev);
}
}
}
     
import java.io.*;
class Pass
{
public static void main(String args[])
{
Console c=System.console();

String un;
char[] pass;

System.out.println("Enetr Username: ");
un=c.readLine();
System.out.println("Enter Password: ");
pass=c.readPassword();
{
if(un.equals("Ketan") && (new String(pass).equals("1234")) )
{
System.out.println("Welcome");
}
else
{
System.out.println("Try again");
}
}
}
}
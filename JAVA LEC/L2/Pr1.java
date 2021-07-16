class Pr1
{
public static void main(String args[])
{
int num= Integer.parseInt(args[0]);
String res = num % 2 == 0 ? "Even" : "Odd";
System.out.println("res =" + res);
}
} 
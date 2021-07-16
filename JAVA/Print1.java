class Print1
{
public static void main(String args[])
{
double d=10.3456;
System.out.printf("|%.1f|%n",d);
System.out.printf("|%.2f|%n",d);
System.out.printf("|%.3f|%n",d);
System.out.printf("|%.4f|%n",d);
System.out.printf("|%8.1f|%n",d);
System.out.printf("|%8.2f|%n",d);
System.out.printf("|%2.1f|%n",d);
System.out.printf("|%2.6f|%n",d);
System.out.printf("|%8.4f|%n",d);
System.out.printf("|%08.6f|%n",d);
System.out.printf("|%09.6f|%n",d);
}


}
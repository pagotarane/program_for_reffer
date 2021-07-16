class Pr3
{
public static void main(String args[])
{
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
int n3 = Integer.parseInt(args[2]);

int max = n1 > n2 ? n1 : n2;
max = n3 > max ? n3 : max;
System.out.println("Maximum number = " + max);
}
}

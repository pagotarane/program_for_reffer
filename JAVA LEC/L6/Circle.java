//wap to find area of circle for which user will supply radious
// ans. should have 2 digit.

import java.io.*;

class Circle
{
public static void main(String args[])throws IOException
{
double r=0.0;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

System.out.println("Enter Radious of Circle");
r=Double.parseDouble(br.readLine());

double a=3.14*r*r;
System.out.printf("Area of Circle = %.2f",a);
}
}
class MyCalculator
{
public static long power(int n,int p)
{
if(n<0 || p<0) throw new RuntimeException("n or p should not be negative");
if(n==0 ||p==0)throw new RuntimeException("n and p should not be 0");
long ans=(long)(Math.pow(n,p));
return ans;
}
}

class Demo
{
public static void main(String args[])
{
long res=MyCalculator.power(2,3);
System.out.println(res);

}
}
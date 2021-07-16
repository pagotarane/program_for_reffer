/*
create four threads : t1-->display 5 a's using m1
*/



class A extends Thread
{
public void run()
{
for (int i=1;i<=5;i++)
	System.out.println("a");
}
}

class B implements Runnable
{
public void run()
{
for (int i=1;i<=10;i++)
	System.out.println("b");
}
}

class P2
{
public static void main(String args[])
{

Runnable r1=new Runnable()
{
public void run()
{
for (int i=1;i<=7;i++)
	System.out.println("c");
}
};

Runnable r2=()->
{
for (int i=1;i<=9;i++)
	System.out.println("d");
};

A a=new A();  Thread t1=new Thread(a);   t1.start();
B b=new B();  Thread t2=new Thread(b);   t2.start();
              Thread t3=new Thread(r1);   t3.start();
              Thread t4=new Thread(r2);   t4.start();
}
}
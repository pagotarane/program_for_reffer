class RunnerTest {
public static String name="unknown";
public void start()
{
System.out.println(name);
}
}
class Runner
{
public static void main(String args[])
{
name="Ketan";
RunnerTest r=new RunnerTest();
r.start();
}
}
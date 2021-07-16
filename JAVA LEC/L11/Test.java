abstract class Rbi
{
int accno;
String name;
double balance;
Rbi(int accno, String name, double balance)
{
this.accno = accno;
this.name = name;
this.balance = balance;
}
void showinfo()
{
System.out.println(accno + " "+ name+ " "+ balance);
}
abstract void deposit(double amount);
abstract void withdraw(double amount);
}

class Nayabank extends Rbi
{
double amount;
Nayabank(int accno,String name,double balance)
{
super(accno,name,balance);
}
void deposit(double amount)
{
balance=balance+amount-10;
}
void withdraw(double amount)
{
balance=balance-amount-20;
}
}

class Test
{
public static void main(String args[])
{
Nayabank n = new Nayabank(420,"Modi",4000.00);
n.showinfo();
n.deposit(100);
n.showinfo();
n.withdraw(500);
n.showinfo();
}
}
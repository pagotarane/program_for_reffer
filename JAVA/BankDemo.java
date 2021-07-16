class CurrentAccount
{
private double balance;
private int number;
public CurrentAccount(int number)
{
this.number=number;
}
public void deposit(double amount)
{
balance=balance+amount;
}
public void withdraw(double amount) throws InsufficientFundsException
{
if(amount<=balance)
{
balance=balance-amount;
}
else
{
double needs=amount-balance;
throw new InsufficientFundsException(needs);
}
}
public double getBalance()
{
return number;
}
}
class InsufficientFundsException extends Exception
{
private double amount;
public InsufficientFundsException(double amount)
{
this.amount=amount;
}
public double getAmount()
{
return amount;
}
}
public class BankDemo
{
public static void main(String args[])
{
CurrentAccount c=new CurrentAccount(101);
System.out.println("Depositing 500");
c.deposit(500.00);
try
{
System.out.println("Withdrawing 100");
c.withdraw(100.0);
System.out.println("Withdrawing 600");
c.withdraw(600.00);
}
catch(InsufficientFundsException e)
{
System.out.println("Sorry,but u r short" +e.getAmount());
}
}
}
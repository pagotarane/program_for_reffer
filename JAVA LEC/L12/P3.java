//create a class Election with the method check() to check if the age of the person voting id>=18 else InvalidAgeException

class InvalidAgeException extends Exception {}
class Election
{
public static void check(int age) throws InvalidAgeException
{
if(age>=18)
System.out.println("U can vote");
else
throw new InvalidAgeException();
}
}
class P3
{
public static void main(String args[]) //throws InvalidAgeException
{
try
{
Election.check(12);
}
catch(InvalidAgeException e)
{
System.out.println("Age should be 18 or above");
}
}
}
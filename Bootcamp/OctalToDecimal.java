import java.util.*;

class OctalToDecimal

{

public static void main(String args[])

{
               
	 Scanner scanner=new Scanner(System.in);

         System.out.println("Enter the Octal Number:");

         int octalNumber=0,decimalNumber=0,lastDigit=0,base=1;

         octalNumber=scanner.nextInt();
 
         while(octalNumber>0)

         {
	
		int exponent=0;

                lastDigit=octalNumber%10;
 
                decimalNumber=decimalNumber+lastDigit*base;
      
  		octalNumber=octalNumber/10;
		base=base*8
;	  
		System.out.println(base);
	}
	System.out.println(decimalNumber);
	
}
}
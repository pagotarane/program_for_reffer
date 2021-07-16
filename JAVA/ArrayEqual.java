import java.util.Arrays;
 
public class ArrayEqual
{
    public static void main(String[] args)
    {    
        int[] arrayOne = {21, 57, 11, 37, 24};
          
        int[] arrayTwo = {21, 57, 11, 37, 24,12};
          
        boolean a = Arrays.equals(arrayOne, arrayTwo);
          
        System.out.println("Input Arrays :");
         
        System.out.println("First Array : "+Arrays.toString(arrayOne));
         
        System.out.println("Second Array : "+Arrays.toString(arrayTwo));
         
        if(a)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
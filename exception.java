/* 
//try catch block example
public class exception {
    public static void main(String[] args) {
        try {
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println("Result: " + c);
            
        }catch (Exception e) {
           System.out.println("caught exception:"+e);
        }
        

        
    }
    
}

//input mismatch exception example
import java.util.Scanner;
public class exception{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter value if a:");
       try {
           int a=sc.nextInt();
           System.out.println("a= :"+a);
       } catch (Exception e) {
           System.out.println("caught exception:"+e);

       }      
    }
}
  
//null pointer exception example

public class exception{
     public static void main(String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage);
        }
    }
    
}
 
//array index out of bound exception example
public class exception{
    public static void main(String[] args) {
        try {
            int arr[]=new int[5];
            arr[7]=10; //accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
}

    */
//multiple catch block example
public class exception{
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b; //may throw ArithmeticException
            int arr[]=new int[5];
            arr[7]=10; //may throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
}
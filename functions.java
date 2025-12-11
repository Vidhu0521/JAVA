/* 
public class functions {
    public static void main(String[] args) {
       
       System.out.println(add(2,3));
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
*/
import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int c=sc.nextInt();
        System.out.print("Enter b: ");
        int d= sc.nextInt();
        System.out.println("Sum of two numbers is: ");
        System.out.println(add(c,d));
        System.out.println("Subtraction of two numbers is: ");
        System.out.println(sub(c,d));
        System.out.println("Multiplication of two numbers is: ");
        System.out.println(mul(c,d));
        System.out.println("Division of two numbers is: ");
        System.out.println(div(c,d));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a *b ;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
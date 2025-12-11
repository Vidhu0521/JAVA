//fibbonacci series by recursion
import java.util.Scanner;
  
   public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)
         {
          System.out.print(fib(i)+" ");
         }
    }
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else if(n==3){
            return 1;
        }

        else{
            return fib(n-1)+fib(n-2);
        }
    }
        
}


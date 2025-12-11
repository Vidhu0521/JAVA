import java.util.Random;
import java.util.Scanner;
public class whileguessnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rc = new Random();
        
        int x=rc.nextInt(101);
        int num=0;
        int count=0;
        while(x!=num){
            System.out.print("Guess the number: ");
            num=sc.nextInt();
            if(num<x){
                System.out.println("My number is greater than your guess");
                count++;
            }
            else if(num>x){
                System.out.println("My number is less than your guess");
                count++;
            }
            else if(num==x){
                System.out.println("Your guess is correct!!");
                count++;
                System.out.println("Number of attempts are: "+count);
            }
            else{
                System.out.println("Invalid input");
                break;

        }


    }

    }
}
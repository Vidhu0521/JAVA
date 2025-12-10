import java.util.Random;
import java.util.Scanner;
public class guessnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rc = new Random();
        int x=rc.nextInt(100);
        for(int i=0;i<=100;i++){
            System.out.print("Guess the number: ");
            int num=sc.nextInt();
            if(num<x){
                System.out.println("My number is greater than your guess");
            }
            else if(num>x){
                System.err.println("My number is less than your guess");
            }
            else{
                System.err.println("Your guess is correct!!");
                break;
            }
        }


    }

}

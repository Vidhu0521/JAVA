import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Your Name:");
        String name=sc.nextLine();
        String lower=name.toLowerCase();
        String username="";
        StringBuilder sb=new StringBuilder(username);
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i);
             if (ch == ' ') {
                sb.append('.');   
            }
            else if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);    
            }
       
            
        }
        System.out.println("Your username is: "+sb);

    }

    }
    


//restaurantSimulator
import java.util.Scanner;
public class restaurentsim{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    
    String[] menu= new String[5];
    menu[0]= "1)Chilli Chicken - rs-220";
    menu[1]= "2)panneer 65 - rs-230";
    menu[2]= "3)Chicken Biryani - rs-270";
    menu[3]= "4)Mutton Biryani - rs-350";
    menu[4]= "5)prawns Biryani - rs-300";
    
        int order=0;
        int select=0;
        while(select!=4){
            System.out.println("1)Display Menu");
            System.out.println("2)Order ");
            System.out.println("3)Payment Amount ");
            System.out.println("4)Quit");
             System.out.print("Eneter your choice:");
             select= sc.nextInt();
              
             if(select== 1){
                for(int i=0;i<menu.length;i++){
                    System.out.println(menu[i]);
                }
            }
            else if(select==2){
                System.out.println("Enter the serial number of your order: ");
                int ord=sc.nextInt();
                order=ord;
                System.out.println("You have ordered: "+menu[order-1]);
            }
            else if(select==3){
                if(order ==1){
                    System.out.println("Total amount to be paid is: rs-220");
                }
                else if(order==2){
                    System.out.println("Total amount to be paid is: rs-230");
                }
                else if(order==3){
                    System.out.println("Total amount to be paid is: rs-270");
                }
                else if(order==4){
                    System.out.println("Total amount to be paid is: rs-350");
                }
                else if(order==5){
                    System.out.println("Total amount to be paid is: rs-300");
                }
               
            }
        }
        System.out.println("Thank you for visiting our restaurant!");
        



}
}
    
/* 
public class array {
    public static void main(String[] args) {
        String[] names={"Suswaran","sai kumar","vrushank","sahith rao","ajay","ganesh","dharam","vidhu","sai surya","sai vardhan"};
        System.out.println("Name: ");
        System.out.println(names[3]);
        names[3]="pranav";
        System.out.println("Updated name: ");
        System.out.println(names[3]);
    }
}

public class array {
    public static void main(String[] args) {
        String[] names= new String[10];
        System.out.println("Name: ");
        System.out.println(names[3]);
        names[3]="pranav";
        System.out.println("Updated name: ");
        System.out.println(names[3]);
        for(int i=0;i<=names.length-1;i++){
            System.out.print((i+1)+")"+names[i]+" ");
        }
    }

}
    
public class array {
    public static void main(String[] args) {
        int[] nums= new int[100];
       for(int i=1;i<=nums.length;i++){
            nums[i-1]=2*i;
       }
       System.out.println("");
        System.out.println("Multiples of 2");
       for(int i=0;i<nums.length;i++){
               
                System.out.print(nums[i]+" ");
            
        }

         for(int i=1;i<=nums.length;i++){
            nums[i-1]=3*i;
       }
       System.out.println("");
       System.out.println("Multiples of 3");
       for(int i=0;i<nums.length;i++){
                
                System.out.print(nums[i]+" ");
            
        }
         for(int i=1;i<=nums.length;i++){
            nums[i-1]=5*i;
       }
       System.out.println("");
       System.out.println("Multiples of 5");
       for(int i=0;i<nums.length;i++){
                
                System.out.print(nums[i]+" ");
            
        }
    }

}
   //two sum 
   import java.util.Scanner;
   public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums= {1,2,3,4,5,6};
        System.out.print("Enter Twosome Value: ");
        int Twosum=sc.nextInt();
       for(int i=0;i<=nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==Twosum){
                System.out.println(nums[i]+"+"+nums[j]+"="+Twosum);
            }
        }
       }

    }
}
       */
// Remove duplicate from a Array 
public class array{
    public static void main(String[] args) {
       int[] arr={1,1,2,3,4,4,4,6,7,9,9} ;
       int count=0;
       for(int i=0;i<arr.length;i++ ){ 
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                arr[i]=arr[j].remove;
            }
            
        }
       }

    }
}
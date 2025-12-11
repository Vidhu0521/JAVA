/* 
//number triangle
public class patternsf {
    public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=i;j<i+1;j++){
             System.out.print(j+1);
        }
        System.out.println("");
    }
    }
    
}

//number triangle reverse
public class patternsf {
    public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=5;j>i+1;j--){
             System.out.print(j-1);
        }
        System.out.println("");
    }
    }
    
}
*/
//floyds triangle
public class patternsf {
    public static void main(String[] args) {
        int count=0;
    for(int i=0;i<5;i++){
        for(int j=0;j<i+1;j++){
             System.out.print(count+ " ");
                count++;
        }
        System.out.println("");
    }
    }
    
}
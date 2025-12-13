public class palindrome {
    
}
class Solution {
    public static boolean isPalindrome(String s) {
        String lower=s.toLowerCase();
        
        String trim=lower.replaceAll("[^a-z]","");
        String reversed = "";

       
        for (int i = trim.length() - 1; i >= 0; i--) {
            reversed = reversed + trim.charAt(i);
        }
            return trim.equals(reversed);
        
    }
    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";

       

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
        

            
        
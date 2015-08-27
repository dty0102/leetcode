Solution 1 : transfer the integer to string, this method needs extra space
public class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j){
            if(s.charAt(i) != s.charAt(j)){return false;}
            i++;
            j--;
        }
        return true;
    }
}
Solution 2 : do not need extra space, reverse the number and then compare it with the original one
public class Solution {
   public boolean isPalindrome(int x) {
        int palindromeX = 0;
        int inputX = x;
        while(x>0){
            palindromeX = palindromeX*10 + (x % 10);
            x = x/10;
        }
        return palindromeX==inputX; 
    }
}

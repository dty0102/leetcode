public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (!set.contains(n) && n != 1){
            set.add(n);
            int next = compute(n);
            n = next;
        }
        if (n == 1) return true;
        else return false;
    }
    public int compute(int n){
        int result = 0;
        while(n > 0){
            int digit = n%10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }
}

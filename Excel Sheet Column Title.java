Solution : pay attention to the situation that the position of the letter will cause some problem, like Z is 26 and the n%26 will be zero, and the resut will be A@ instead of AA, so the situation that the n%26 == zero should be considered seperately.
public class Solution {
    public String convertToTitle(int n) {
        if (n == 0) return null;
        String result = "";
        while (n > 0){
            int tail = n % 26;
            if (tail == 0){
                tail = 26;
                n = n - 1;
            }
            char cur = (char)('A' + tail - 1);
            result = cur + result;
            n = n/26;
        }
        return result;
    }
}

public class Solution {
    public String shortestPalindrome(String s) {
        //a or empty string
        if (s.length()<2) return s;

        char[] c=s.toCharArray();
        //We can always use the first character of an odd length solution
        int r=s.length()%2;

        //start at the end, the first one we find will be the longest internal palindrome
        for(int j=c.length-1;j>=0;j--) {
            if(c[0]==c[j]) {
                int i=j;
                int nk=j;
                boolean fail=false;
                //check that it's a palindrome till we hit the halfway mark
                for(;i>=j/2;i--) {
                    if(c[i]==c[j]) {
                        //keep track of where to pick up if this fails
                        nk=j;
                    }
                    if (c[j-i]!=c[i]) { 
                        //not a palindrome
                        fail=true;
                        break;
                    }
                }
                if (!fail) {
                   //we found the longest one, we're done
                    r=j;
                    break;
                } else {
                   //pick up at a possible palindrome spot
                    j=nk;
                }
            }
        }
        //If the whole thing is a palindrome then return it unchanged
        if (r==s.length()) return s;
        StringBuffer prepend=new StringBuffer();
        //otherwise reverse prepend to the string
        for(int i=c.length-1;i>r;i--) {
             prepend.append(c[i]);
        }
        //and put the rest of the word on the end.
        prepend.append(s);


        return prepend.toString();
    }
}



    int j = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == s.charAt(j)) { j += 1; }
    }
    if (j == s.length()) { return s; }
    String suffix = s.substring(j);
    return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;

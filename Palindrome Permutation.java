Solution:
Count the frequency of each character.
And there should only be x odd frequency number(x <= 1)

public class Solution {
    public boolean canPermutePalindrome(String s) {
        if(s.length() <= 1) {return true;}
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){map.put(s.charAt(i),map.get(s.charAt(i))+1);}
            else map.put(s.charAt(i),1);
        }
        int x = 0;
        for(Character c : map.keySet()){
            if(map.get(c)%2 != 0){x++;}
        }
        return x <=1;
    }
}

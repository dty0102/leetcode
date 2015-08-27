Solution : pay attention to difference between containsKey , containsValue and contains, and the situation s = "ab" and t = "aa"
import java.util.Hashtable; 
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character,Character> map = new Hashtable<Character, Character>();
        for(int i = 0; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) {return false;}
                else continue;
            }
            else {
                if(!map.containsValue(t.charAt(i))) {map.put(s.charAt(i),t.charAt(i));}
                //the value of t may have duplicate for different char in s
                else return false;
            }
        }
        return true;
    }
}

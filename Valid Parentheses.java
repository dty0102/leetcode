public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {return true;}
        if (s.length()%2 != 0){return false;}
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            Character cur = s.charAt(i);
            if(cur == '(' || cur == '[' || cur == '{'){stack.push(cur);continue;}
            if(cur == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '(') {return false;}
                else stack.pop();
            }
            if(cur == ']') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '[') {return false;}
                else stack.pop();
            }
            if(cur == '}') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '{') {return false;}
                else stack.pop();
            }
        }
        return stack.isEmpty();
        }
}

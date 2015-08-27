Solution : build a array of StringBuilder and then add the char to them according to the order, and the append them together to build the result
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        int i = 0;
        StringBuilder[] str = new StringBuilder[numRows];
        for(int k = 0 ; k < numRows; k++){ 
        // need to build each StringBuilder seperately or it will cause nullpointer exception
            str[k] = new StringBuilder();
        }
        while(i < len){
            for(int j = 0; i < len && j < numRows; j++){
                str[j].append(s.charAt(i));
                i++;
            }
            for(int m = numRows - 2; i < len && m >= 1; m--){
                str[m].append(s.charAt(i));
                i++;
            }
        }
        String result = "";
        for(int l = 0; l < numRows; l++){
            result += str[l];
        }
        return result;
    }
}

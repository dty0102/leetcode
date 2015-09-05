This is a follow up of Shortest Word Distance. The only difference is now word1 could be the same as word2.
public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        if(words == null || words.length == 0) {throw new NullPointerException();}
        HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){ArrayList<Integer> cur = map.get(words[i]); cur.add(i); map.put(words[i],cur);}
            else {ArrayList<Integer> cur = new ArrayList<Integer>();cur.add(i);map.put(words[i],cur);}
        }
        ArrayList<Integer> index1 = map.get(word1);
        ArrayList<Integer> index2 = map.get(word2);
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        if(word1.equals(word2)){
            for(int m = 0; m < index1.size() - 1; m++){
                min = Math.min(min,Math.abs(index1.get(m+1) - index1.get(m)));
            }
        }
        else{
        while(i < index1.size() && j < index2.size()){
            int dis = Math.abs(index1.get(i) - index2.get(j));
            min = Math.min(dis,min);
            if(index1.get(i) > index2.get(j)) {j++;}
            else if (index1.get(i) < index2.get(j)){i++;}
        }
        }
        return min;
    }
}

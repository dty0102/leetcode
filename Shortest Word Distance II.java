This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters. How would you optimize it?
Build the hashmap in the constructor and then compute the distance using the hashmap
public class WordDistance {
    public HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
    public WordDistance(String[] words) {
        if(words == null || words.length == 0) {throw new NullPointerException();}
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){ArrayList<Integer> cur = map.get(words[i]); cur.add(i); map.put(words[i],cur);}
            else {ArrayList<Integer> cur = new ArrayList<Integer>();cur.add(i);map.put(words[i],cur);}
        }
    }

    public int shortest(String word1, String word2) {
        ArrayList<Integer> index1 = map.get(word1);
        ArrayList<Integer> index2 = map.get(word2);
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while(i < index1.size() && j < index2.size()){
            int dis = Math.abs(index1.get(i) - index2.get(j));
            min = Math.min(dis,min);
            if(index1.get(i) > index2.get(j)) {j++;}
            else if (index1.get(i) < index2.get(j)){i++;}
        }
        return min;
    }
}

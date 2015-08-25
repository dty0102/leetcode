Solution: the special situation of numRows < 3
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0) return result;
        ArrayList<Integer> level = new ArrayList<Integer>();
        level.add(1);
        result.add(new ArrayList<Integer>(level));
        if(numRows == 1) return result;
        level.add(1);
        result.add(new ArrayList<Integer>(level));
        if(numRows == 2) return result;
        for(int i = 2; i < numRows; i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            build(result.get(i - 1), cur);
            result.add(cur);
        }
        return result;
    }
    public void build(List<Integer> prev, ArrayList<Integer> cur){
        cur.add(1);
        for(int i = 0; i < prev.size() - 1; i++){
            cur.add(prev.get(i) + prev.get(i + 1));
        }
        cur.add(1);
        return;
    }
}

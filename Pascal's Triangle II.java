Solution: to compute the next level, we only need the prev level, so there is no need to store all level,we just need space for two arraylists
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> level = new ArrayList<Integer>();
        level.add(1);
        if(rowIndex == 0) {return level;}
        level.add(1);
        if(rowIndex == 1){return level;}
        for(int i = 2; i <= rowIndex;i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 0; j < level.size() - 1; j++){
            cur.add(level.get(j) + level.get(j + 1));}
            cur.add(1);
            level = cur; 
        }
        return level;
    }
}

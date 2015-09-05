
public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    private List<List<Integer>> result = null;
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        result = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        if (numbers == null || numbers.length <= 2) {return result;}
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            if (map.containsKey(numbers[i])){continue;}
            findremain(numbers,i + 1,0 - numbers[i]);
            map.put(numbers[i], 1);
        }
        return result;
    }
    private void findremain(int[] numbers, int start, int target){
        if (numbers == null || numbers.length == 0 || start >= numbers.length) {return;}
        HashSet<ArrayList<Integer>> map = new HashSet<ArrayList<Integer>>();
        int end = numbers.length - 1;
        while(start < end){
            ArrayList<Integer> triples = new ArrayList<Integer>();
            if (numbers[start] + numbers[end] < target) {start++;}
            else if (numbers[start] + numbers[end] > target) {end--;}
            else {
                triples.add(0 - target);
                triples.add(numbers[start]); 
                triples.add(numbers[end]);
                if(!map.contains(triples)) {result.add(triples);
                    map.add(triples);}
                start++; end--;
            }
        }
    }
}

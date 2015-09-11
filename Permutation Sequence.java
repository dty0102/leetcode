Solution 1: O(n*k)
 public String getPermutation(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            nums.add(i);
        }
        ArrayList<ArrayList<Integer>> permutation = permute(nums);
        ArrayList<Integer> list = permutation.get(k - 1);
        String result = "";
        for (int i = 0; i < list.size(); i++){
            result += list.get(i);
        }
        return result;
        }
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result,list,nums);
        return result;
    }
    private void helper(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list, ArrayList<Integer> nums){
        if (list.size() == nums.size()) {
            ArrayList<Integer> newlist = new ArrayList<Integer>(list);
            result.add(newlist);
            return ; 
        }
        for (Integer curr : nums){
            if(list.contains(curr)){continue;}
                list.add(curr);
                helper(result,list,nums);
                list.remove(list.size()-1);
            }
        }
        
Solition2：O(n2)
class Solution {
    /**
      * @param n: n
      * @param k: the kth permutation
      * @return: return the k-th permutation
      */
   public int nFatorial(int n ) {
        if(n == 0)
            return 1;
        return n * nFatorial(n - 1);
 }

public String getPermutation(int n, int k) {
        if(n == 0)
            return "";

        String res = "";

        // numbers to be added to result string
        List<Integer> num = new ArrayList<Integer>();

        // initialization, 0 just for padding
        for(int i = 0; i <= n; i++)
            num.add(i);

        int factorial;
        int index;

        for(int i = n; i > 0; i--) {
            factorial = nFatorial(i - 1);

            // calculate current number index
            index = (int) Math.ceil(k / (double) factorial);

            res += num.get(index);

            // after adding, delete it from rest set
            num.remove(index);

            // update k for the next loop
            k = k % factorial;
            if(k == 0)
                k = factorial;
        }
        return res;
}
}


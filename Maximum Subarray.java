Solution : 
public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        //function: f[i]表示以第i个字符结尾的最大subarray
        int len = nums.size();
        int [] f = new int [len+1];
        f[0] = Integer.MIN_VALUE;
        f[1] = nums.get(0);
        if(len == 1) return f[1];
        for(int i = 2; i<= len; i++){
            f[i] = Math.max (f[i-1] + nums.get(i-1), nums.get(i-1));
        }
        int result = Integer.MIN_VALUE;
        for(int i = 0; i<= len; i++){
            if (f[i] >= result) {result = f[i];}
        }
        return result;
    }

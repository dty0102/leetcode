private String outputRange(int n, int m) {
    return (n == m)?String.valueOf(n) : n + "->" + m;
}

public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> ranges = new ArrayList<String>();
    if (nums.length == 0) {  //Empty array misses the range lower->upper.
        ranges.add(outputRange(lower, upper));
        return ranges;
    }
    int prev;
    if (nums[0] - lower > 0) {    //Handles lower boundary. Notice "inclusive".
        ranges.add(outputRange(lower, nums[0] - 1));
        prev = nums[0];
    } else {
        prev = lower;
    }
    for (int cur : nums) {
        if (cur - prev > 1) { 
            ranges.add(outputRange(prev + 1, cur - 1)); //Misses range if distance > 1.
        }
        prev = cur;
    }
    if (upper - prev > 0) {  //Handles the upper boundary.
        ranges.add(outputRange(prev + 1, upper));
    }

    return ranges;
}

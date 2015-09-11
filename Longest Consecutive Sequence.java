public int longestConsecutive(int[] num) {
        // write you code her
        if (num == null || num.length == 0) {return 0;}
        if (num.length == 1){return 1;}
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < num.length;i++ ){
            if (!map.containsKey(num[i])) {map.put(num[i],1);}
        }
        //int result = 0;
        int max = 1;
        for (int i = 0; i < num.length; i++){
            int result = 1;
            if (!map.containsKey(num[i] + 1) && !map.containsKey(num[i] - 1)) {continue;}
            int cur = num[i];
            while (map.containsKey(cur + 1)) {result++; cur = cur+1;}
            cur = num[i];
            while (map.containsKey(cur - 1)) {result++; cur = cur-1;}
            max = Math.max(max,result);
        }
        return max;
    }

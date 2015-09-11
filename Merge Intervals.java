     //如果直接进行比较，则可能因为无序而产生错误，所以应该先对interval进行排序，排序前应该重写comparator 函数来保证比较方法是正确的
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        List<Interval> result = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) return result;
        Collections.sort(intervals, new IntervalComparator());      
        result.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i ++){
            Interval prev = result.get(result.size() - 1);
            Interval cur = intervals.get(i);
            if (prev.end < cur.start) {result.add(cur);}
            else {
                result.remove(result.size() - 1);
                int start = Math.min(prev.start,cur.start);
                int end = Math.max(prev.end,cur.end);
                Interval newinterval = new Interval(start,end);
                result.add(newinterval);
            }
        }
        return result;
    }
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

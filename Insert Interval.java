
public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new LinkedList<>();
    int i = 0;
    // add all the intervals ending before newInterval starts
    while (i < intervals.size() && intervals.get(i).end < newInterval.start)
        result.add(intervals.get(i++));
    // merge all overlapping intervals to one considering newInterval
    while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
        newInterval = new Interval( // we could mutate newInterval here also
                Math.min(newInterval.start, intervals.get(i).start),
                Math.max(newInterval.end, intervals.get(i).end));
        i++;
    }
    result.add(newInterval); // add the union of intervals we got
    // add all the rest
    while (i < intervals.size()) result.add(intervals.get(i++)); 
    return result;
}




     public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
        intervals.add(newInterval);
        if (intervals == null || intervals.size() == 0) return intervals;
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
                Interval newinter = new Interval(start,end);
                result.add(newinter);
            }
        }
        return result;
    }
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

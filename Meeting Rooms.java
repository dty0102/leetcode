Solution : use comparator to sort the array according to the start time, the comparator should be inner class and it should implements the Comparator<Interval>
public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        IntervalComparator com = new IntervalComparator();
        Arrays.sort(intervals,com);
        for(int i = 0; i < intervals.length - 1;i++){
            if(intervals[i].end > intervals[i+1].start){return false;}
        }
        return true;
    }
    private class IntervalComparator implements Comparator<Interval>{
    @Override
    public int compare(Interval a, Interval b){
        if(a.start < b.start) {return -1;}
        else return 1;
    }
}
}

public class Solution {
    public boolean canAttendMe25etings(Interval[] intervals) {
    	Arrays.sort(intervals,new Comparator<Interval>(){
    		public int compare(Interval o1, Interval o2){
    			return o1.start - o2.start;
    		}
    	});
    	if(intervals.length == 0) return true;
        int start = intervals[0].start;
        int end = intervals[0].end;
        for(int i = 1; i < intervals.length; i++){
        	if(intervals[i]. start < end) return false;
        	else{
        		start = intervals[i].start;
        		end = intervals[i].end;
        	}
        }
        return true;
    }
}
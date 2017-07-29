public class MovingAverage {

	Queue<Integer> queue;
	int size;
	int sum = 0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        this.size = size;
        sum = 0;
    }
    
    public double next(int val) {
        if(queue.size() < size){
        	sum += val;
        	queue.add(val);
        	return (double)sum/queue.size();
        }
        else{
        	sum -= queue.poll();
        	queue.add(val);
        	sum += val;
        	return (double)sum/queue.size();
        }
    }
}
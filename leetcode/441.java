public class Solution {
    public int arrangeCoins(int n) {
        int i =1;
        int curr = 0;

        while(true){
        	curr += i;
        	if(curr > n) return i-1;
        	else if(curr == n) return i;
        	else i++;
        }

        return -1;
    }



    public int arrangeCoins(int n){
    	int begin = 0;
    	int end = n;

    	while(begin <= end){
    		int mid = begin + (end-begin)/2;
    		if(mid*0.5*mid + mid*0.5 > n){
    			end = mid-1;
    		}else{
    			begin = mid+1;
    		}
    	}

    	return begin-1;
    }
}
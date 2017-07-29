
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int begin = 1;
        int end = n;

        while (begin < end) {
        	int mid = begin + (end - begin)/2;
        	if(guess(mid) == 0) return mid;
        	else if(guess(mid) == -1) end = mid-1;
        	else begin = mid+1;
        }

        return begin;

    }


}
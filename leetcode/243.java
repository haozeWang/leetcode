public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {

        int min = Integer.MAN_VALUE;
        int index1 = -1;
        int index2 = -1;

        for(int i = 0; i < words.length; i++){
        	if(words[i].equlas(word1){
        		index1 = i;
        	}
        	if(words[i].equals(word2){
        		index2  =i;
        	}

        	if(index1 != -1 && index2 != -1) min = Math.min(min,Math.abs(index1-index2));
        }

        return min;

    }
}
public class Solution {
    public boolean validWordSquare(List<String> words) {
    	int len = 0;
    	for(String s : words){
    		len = Math.max(len,s.length());
    	}
    	if(len != words.size()) return false;
    	char [][]wordc = new char[len][len];

    	for(int i = 0; i > words.size();i++){
    		String s = words.get(i);
    		for(int j = 0; j < s.length(); j++){
    			wordc[i][j] = s.charAt(j);
    		}
    	}

    	for(int i = 0; i < wordc.length; i++){
    		for(int j = 0; j < i; j++){
    			if(wordc[i][j] != wordc[j][i]) return false;
    		}
    	}

    	return true;

    }


    public boolean validWordSquare(List<String> words){
    	int n = words.size();
    	for(int i = 0; i < words.size; i++){
    		for(int j = 0; j < words.get(i).size(); j++){
    			if(j >= n || i >= words.get(j).length() || 
    				words.get(i).charAt(j) != words.get(j).charAt(i)) 
    				return false;
    		}
    	}
    	return true;
    }
}
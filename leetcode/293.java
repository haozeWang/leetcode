public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new LinkedList<>();
        for(int i = 0; i < s.length()-1; i++){
        	if(s.charAt(i) == '+' && s.charAt(i+1) == '+'){
        		String temp = s.substring(0,i)+"--"+s.substring(i+2);
        		list.add(temp);
        	}
        }
        return list;
    }
}
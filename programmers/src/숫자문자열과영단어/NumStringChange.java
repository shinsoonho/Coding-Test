package 숫자문자열과영단어;


class Solution {
    public int solution(String s) {
 
    	int answer = 0;
    	
    	String[] alpha = {"zero", "one", "two", "three", "four",
    						"five", "six", "seven", "eight", "nine"};
    	String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
    	for( int i = 0 ; i < num.length; i++ ) {
    			s = s.replaceAll(alpha[i], num[i]);
    	}
    	answer = Integer.parseInt(s);
    	
        return answer;
    
    }
}

public class NumStringChange {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		String num = "one4seveneight";
		
		s.solution(num);

	}

}

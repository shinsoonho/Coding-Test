package 삼진법뒤집기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
    	
    	int answer = 0;
    	
        List<Integer> num = new ArrayList<Integer>();
        
        while ( n>0 ) {
        	int remainder = n%3;
        	n = n/3;
        	num.add(remainder);
        }
        
        for(int i = 0; i<num.size(); i++) {
        	answer += (int)(num.get(i)*Math.pow(3, num.size()-1-i));
        }
        
        return answer;
    }
}

public class ReverseTrit {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int n = 45;
		s.solution(n);

	}

}

package 예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        
        Arrays.sort(d);
        
        for( int i = 0; i<d.length; i++ ) {
        	result += d[i];
        	if( result > budget ) break;
        	answer ++;
        }
        
        System.out.println(answer);
        
        return answer;
    }
}

public class Budget {

	public static void main(String[] args) {
		
		Solution s= new Solution();
		
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		s.solution(d, budget);

	}

}

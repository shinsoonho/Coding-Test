package programmers;

class Solution {
    
	public int solution(int[] absolutes, boolean[] signs) {
		
		int answer = 0;
		
		for( int i = 0; i<signs.length; i++ ) {
			if ( signs[i] == false ) {
				absolutes[i] = -absolutes[i];
			}
			
			answer += absolutes[i];
			
		}
		
        return answer;
    }

}

public class AbsoluteAdd {

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		Solution s = new Solution();
		s.solution(absolutes, signs);

	}

}

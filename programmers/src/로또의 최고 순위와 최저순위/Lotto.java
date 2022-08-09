package 로또;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int num = 0;
        
        for(int i : lottos) {
        	if( i == 0 ) {
        		cnt ++;
        	} else {
        		for(int j : win_nums) {
        			if( i == j ) {
        				num ++;
        				break;
        			}
        		}
        	}
        }
        answer[0] = (cnt+num) > 1 ? 7-(cnt+num) : 6;
        answer[1] = num > 1 ? 7-num : 6;
        
        return answer;
    }
}

public class Lotto {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		Solution s = new Solution();
		s.solution(lottos, win_nums);

	}

}

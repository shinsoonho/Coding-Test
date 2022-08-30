package 모의고사;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        
    	int[] answer = {};
    	
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 맞춘 수를 저장할 변수
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for( int i = 0; i<answers.length; i++ ) {
        	if( first[i%5] == answers[i] ) cnt1++;
        	if( second[i%8] == answers[i] ) cnt2++;
        	if( third[i%10] == answers[i] ) cnt3++;
        }
        
        // 맞춘 수 중 가장 큰 수 찾기
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        
        List<Integer> list = new ArrayList<Integer>();
        // max의 값과 같다면 오름차순으로 list에 add
        if( cnt1 == max ) { list.add(1); }
        if( cnt2 == max ) { list.add(2); }
        if( cnt3 == max ) { list.add(3); }        
        
        answer = new int[list.size()];
        
        for( int i = 0; i<answer.length; i++ ) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}

public class MocTest {

	public static void main(String[] args) {
		
		int[] answers = {1, 3, 2, 4, 2, 2, 3, 5};
		Solution s = new Solution();
		s.solution(answers);

	}

}

package 성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for( int i = 0; i<survey.length; i++ ) {
        	// 4보다 작을 때 servey 첫번째 char의 value값 변경
        	if( choices[i] < 4 ) {
        		map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
        	} else if( choices[i] > 4 ) {
        		map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
        	}
        }
        
        // 값이 같을 경우 사전순으로 표시
        if( map.get('R') >= map.get('T') ) {
        	sb.append("R");
        } else {
        	sb.append("T");
        }
        
        if( map.get('C') >= map.get('F') ) {
        	sb.append("C");
        } else {
        	sb.append("F");
        }
        
        if( map.get('J') >= map.get('M') ) {
        	sb.append("J");
        } else {
        	sb.append("M");
        }
        
        if( map.get('A') >= map.get('N') ) {
        	sb.append("A");
        } else {
        	sb.append("N");
        }
        
        answer = sb.toString();
        
        return answer;
    }
        
}

public class MBTITest {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		s.solution(survey, choices);

	}

}

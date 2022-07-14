package 완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for( String part : participant ) {
        	if( map.get(part) == null ) {        		
        		map.put(part, 1);
        	} else {
        		map.put(part, map.get(part)+1);
        	}
        }
        
        for( String comp : completion ) {
        	map.put(comp, map.get(comp)-1);
        }
        
        for( String key : map.keySet() ) {
        	if( map.get(key) != 0 ) {
        		answer = key;
        	}
        }
        System.out.println(answer);
        
       return answer;
    }
}

public class Marathon {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		s.solution(participant, completion);

	}

}

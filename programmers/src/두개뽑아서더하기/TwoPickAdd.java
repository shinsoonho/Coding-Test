package 두개뽑아서더하기;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
    	
    	Set<Integer> ts = new TreeSet<Integer>();
    	
    	for( int i = 0; i<numbers.length-1; i++ ) {
    		for( int j = i+1; j<numbers.length; j++ ) {
    			int add = numbers[i]+numbers[j];
    			ts.add(add);
    		}
    	}
    	
    	int[] answer = new int[ts.size()];
    	int cnt = 0;
    	
    	Iterator it = ts.iterator();
    	while( it.hasNext() ) {
    		answer[cnt] = (int)it.next();
    		cnt ++;
    	}
    	
    	return answer;
    }
}


public class TwoPickAdd {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] numbers = {2, 1, 3, 4, 1};
		
		s.solution(numbers);

	}

}

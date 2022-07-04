package 없는숫자더하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> num1 = new ArrayList<Integer>();
        for( int i = 0; i<10; i++ ) {
        	num1.add(i);
        }
        
        List<Integer> num2 = new ArrayList<Integer>();
        for( int i = 0; i<numbers.length; i++ ) {
        	num2.add(numbers[i]);
        }
        
        for( int i = 0; i<num1.size(); i++ ) {
        	if( !num2.contains(num1.get(i)) ) {
        		answer += num1.get(i);
        	}
        }
        
        return answer;
    }
}

public class NoNumberAdd {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		s.solution(numbers);
	}

}

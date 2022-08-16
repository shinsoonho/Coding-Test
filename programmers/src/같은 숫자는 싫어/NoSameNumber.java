package 같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<Integer>();
        // list 첫 수 삽입
        list.add(arr[0]);
        
        // arr[i]와 arr[i-1] 비교
        for( int i = 1; i<arr.length; i++ ) {
        	if( arr[i] != arr[i-1] ) {
        		list.add(arr[i]);
        	}
        }
        
        answer = new int[list.size()];
        
        for( int i = 0; i < list.size(); i++ ) {
        	answer[i] = list.get(i);
        }

        return answer;
    }
  
}

public class NoSameNumber {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {1,1,3,3,0,1,1};
		
		s.solution(arr);
	}

}

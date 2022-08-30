package 체육복;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
    	
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	
    	// 체육수업을 들을 수 있는 학생 수
        int answer = n-lost.length;
        int cnt = 0;
        
        // 도난당한 학생이 여유 체육복을 가지고 있는 경우
        for( int i = 0; i<lost.length; i++ ) {
        	for( int j = 0; j<reserve.length; j++ ) {
        		if( lost[i] == reserve[j] ) {
        			cnt ++;
        			lost[i] = -1;
        			reserve[j] = -1;
        			break;
        		}
        	}
        	
        }
        
        // 도난당한 학생의 앞 뒤 번호 학생이 여유 체육복을 가지고 있는 경우
        for( int i = 0; i<lost.length; i++ ) {
        	for( int j = 0; j<reserve.length; j++ ) {
        		if( lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1 ) {
        			cnt ++;
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        answer += cnt;
        System.out.println(answer);
        return answer;
    }
}

public class GymClothes {

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		Solution s = new Solution();
		s.solution(n, lost, reserve);

	}

}

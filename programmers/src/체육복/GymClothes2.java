package 체육복;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // hashmap을 사용해서 할 수 없을까??
        // 전체 학생을 1로 놓고 체육복을 잃어버린학생은 -1, 여유분이 있는 학생은 +1
        // reserve 배열에 있는 학생은 빌려주면 지워야 함
        
        Map<Integer, Integer> student = new HashMap<Integer, Integer>();
        
        // 모든 학생 1로 초기화
        for( int i = 1; i<=n; i++ ) {
        	student.put(i, 1);
        }
        
        // 체육복을 잃어버린 학생은 -1
        for( int i=0; i<lost.length; i++ ) {
        	student.put(lost[i], student.get(lost[i])-1);
        }
        
        // 여유분이 있는 학생은 +1
        for( int i =0; i<reserve.length; i++ ) {
        	student.put(reserve[i], student.get(reserve[i])+1);
        }
        
        // 자기 자신의 체육복을 잃어버려도 다시 더해주었기 때문에 0과 2의 숫자에는 상관이 없음
        // 0은 그냥 받으면 되고 2는 빌려주면 됨
        
        for( int i : student.keySet() ) {
        	//체육복은 도난당했을 경우
        	if( student.get(i) == 0 ) {
        		// 이전번호 학생이 여유분이 있을 경우
        		// 첫번째 학생이 0일 경우
        		if( i>1 && student.get(i-1) == 2 ) {
        			student.put(i-1, student.get(i-1)-1);
        			student.put(i, 1);
        		// 이후번호 학생이 여유분이 있을 경우
        		// 마지막 학생이 0일 경우
        		} else if( i<n && student.get(i+1) == 2 ) {
        			student.put(i+1, student.get(i+1)-1);
        			student.put(i, 1);
        		}
        	}
        }
        for( int i : student.keySet() ) {
        	if( student.get(i) >= 1 ) {
        		answer ++;
        	}
        }
        
        System.out.println(answer);

        return answer;
    }
}

public class GymClothes2 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		Solution s = new Solution();
		s.solution(n, lost, reserve);

	}

}

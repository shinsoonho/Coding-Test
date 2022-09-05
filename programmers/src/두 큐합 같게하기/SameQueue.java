package 두큐합같게만들기;

import java.util.LinkedList;
import java.util.Queue;


// 두 큐를 같게 하기 위한 방법
// 1. 큐1이 큐2보다 크면 큐1의 첫번째 요소를 큐2의 마지막 요소에 붙인다.
// 2. 큐1과 큐2의 합이 같다면 종료
// 3. 그리디법칙을 사용하여 큐의 합이 영원히 같지 않을 경우를 구한다

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        // 자바에서 제공하는 Queue 사용
        Queue<Integer> list1 = new LinkedList<Integer>();
        Queue<Integer> list2 = new LinkedList<Integer>();
        
        long list1Sum = 0;
        long list2Sum = 0;
        
        // 배열을 LinkedList에 추가하면서 배열의 합을 구함
        for( int i : queue1 ) {
        	list1.add(i);
        	list1Sum += i;
        }
        
        for( int i : queue2 ) {
        	list2.add(i);
        	list2Sum += i;
        }
        
        
        // 배열의 합이 같아지면 반복문 종료
        while( list1Sum != list2Sum ) {
        	
        	if( list1Sum > list2Sum ) {
            	// list의 합이 더 클경우 list1의 첫번째 요소를 제거하면서 list2에 추가
        		int temp = list1.poll();
        		list2.add(temp);
                list1Sum -= temp;
                list2Sum += temp;
            	answer++;

            } else if( list1Sum < list2Sum ) {
            	
            	int temp = list2.poll();
            	list1.add(temp);
            	list1Sum += temp;
            	list2Sum -= temp;
            	
            	answer++;

            }
        	
        	// 그리디법칙(탐욕법)을 사용하여 일정 규칙이 지나면 반복문을 종료함
        	if( answer > (list1.size() + list2.size()) * 2 ) {
        		answer = -1;
        		break;
        	}
        	
            
        	
        }

       return answer;
    }
    
    
}


public class SameQueue {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] queue1 = {3, 2, 7, 2};
		int[] queue2 = {4, 6, 5, 1};
		
		s.solution(queue1, queue2);

	}

}

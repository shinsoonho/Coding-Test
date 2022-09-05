package 올바른괄호;

import java.util.Stack;

// 1. '('기호인 40과 ')'기호인 41이 들어오는 두가지 상황을 가정
// 2. 처음부터 ')' 기호가 들어오면 바로 false 리턴을 해야함
// 3. '('기호는 무조건 push만 함
// 3. ')'기호가 들어오면 pop을 해야함
// 4. 스택이 빈 상태에서 ')'기호가 들어오면 false를 리턴해야함

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // ( : 40,   ) : 41
        
        Stack<Character> stack = new Stack<Character>();
        for( int i = 0; i<s.length(); i++ ) {
        	// 처음부터 )괄호가 들어오면 안되기 때문에 )가 들어오면 바로 false 리턴
        	if( s.charAt(0) == (char)41 ) {
        		answer = false;
        		return answer;
        	} else {
        		// (가 들어오면 스택에 push
        		if( s.charAt(i) == (char)40 ) {
        			stack.push((char)40);
        			// )가 들어올경우
        		} else {
        			// 스택이 비어있는 상태에서 )는 들어올 수 없음
        			if( stack.isEmpty() ) {
        				return false;
        			} else {        				
        				stack.pop();
        			}
        		}
        	}
        }
        
        // 스택이 비었으면 완전한 괄호기 때문에 true 리턴, 남아있으면 완전한 괄호가 아니기 때문에 false리턴
        answer = ( stack.isEmpty() ? true : false );
        

        return answer;
    }
}

public class CorrectParentheses {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		String s = "(()(";
		
		sol.solution(s);
		

	}

}

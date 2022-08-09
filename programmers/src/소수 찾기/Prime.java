package 소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n+1];
        for(int i = 2; i<=n; i++) {
        	check[i] = true;
        }
        
        int root = (int)Math.sqrt(n);
        for( int i = 2; i<=root; i++ ) {
        	if( check[i] == true ) {
        		for( int j = 2; i*j<=n; j++ ) {
        			check[i*j] = false;
        		}
        	}
        }
        
        for( int i = 2; i<=n; i++ ) {
        	if( check[i] == true ) {
        		answer ++;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}

public class Prime {

	public static void main(String[] args) {
		
		int n = 1000000;
		Solution s = new Solution();
		s.solution(n);

	}

}

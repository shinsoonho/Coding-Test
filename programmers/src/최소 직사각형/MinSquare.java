package 최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max_width = 0;
        int max_height = 0;
        
        for( int i = 0; i<sizes.length; i++ ) {
        	// 두 수를 비교해서 큰 길이를 width로 설정
        	if( sizes[i][0] < sizes[i][1] ) {
        		int temp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = temp;
        	}
        	
        	max_width = ( sizes[i][0] > max_width ? sizes[i][0] : max_width );
        	max_height  = ( sizes[i][1] > max_height ? sizes[i][1] : max_height );
        }
        
        answer = max_width * max_height;
        
        return answer;
    }
}

public class MinSquare {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		s.solution(sizes);

	}

}

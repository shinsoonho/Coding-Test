package 최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max_width = 0;
        int max_height = 0;
        
        /*
        for( int[] size : sizes ) {
        	int max = Math.max(size[0], size[1]);
        	int min = Math.min(size[0], size[1]);
        	
        	max_width = Math.max(max_width, max);
        	max_height = Math.max(max_height, min);
        }
        */
        
        for( int[] size : sizes ) {
        	max_width = Math.max(max_width, Math.max(size[0], size[1]));
        	max_height = Math.max(max_height, Math.min(size[0], size[1]));
        }
        
        answer = max_width * max_height;
        System.out.println(answer);
        
        return answer;
    }
}

public class MinSquare2 {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		s.solution(sizes);

	}

}

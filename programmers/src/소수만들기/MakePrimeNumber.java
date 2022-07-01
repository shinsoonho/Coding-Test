package 소수만들기;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for( int i = 0; i<nums.length-2; i++ ) {
        	for( int j = i+1; j<nums.length-1; j++ ) {
        		for( int z = j+1; z<nums.length; z++ ) {
        			int sum = nums[i] + nums[j] + nums[z];
        			for( int l = 2; l<sum; l++ ) {
        				if( sum % l == 0 ) break;
        				
        				if ( l == sum-1 ) {
        					answer++;
        				}
        			}
        		}
        	}
        }
        return answer;
    }
}

public class MakePrimeNumber {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] nums = {1,2,3,4};
		
		s.solution(nums);

	}

}

package 키패드누르기;

class Solution {
    public String solution(int[] numbers, String hand) {
    	
    	int leftLastNumber = 10;
    	int rightLastNumber = 12;
    	
    	StringBuilder sb = new StringBuilder();
    	
    	
    	for( int i = 0; i<numbers.length; i++ ) {

    		if( numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ) {
    			sb.append("L");
    			leftLastNumber = numbers[i];
    		} else if( numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ) {
    			sb.append("R");
    			rightLastNumber = numbers[i];
    		} else {
    			int leftLength = root(leftLastNumber, numbers[i]);
    			int rightLength = root(rightLastNumber, numbers[i]);
    			
    			if( leftLength > rightLength ) {
    				sb.append("R");
    				rightLastNumber = numbers[i];
    			} else if( leftLength < rightLength ) {
    				sb.append("L");
    				leftLastNumber = numbers[i];
    			} else {
    				if(hand.equals("left")) {
    					sb.append("L");
    					leftLastNumber = numbers[i];
    				} else {
    					sb.append("R");
    					rightLastNumber = numbers[i];
    				}
    			}
    			
    		}
    	}
    	
        String answer = sb.toString();
        return answer;
    }
    
    public int root(int lastNumber, int inputNumbers) {
    	int result = 0;
    	
    	lastNumber = (lastNumber == 0) ? 11 : lastNumber;
    	inputNumbers = (inputNumbers == 0) ? 11 : inputNumbers;
		
		if(Math.abs(lastNumber - inputNumbers) == 1 || Math.abs(lastNumber - inputNumbers) == 3) {
			result = 1;
		} else if(Math.abs(lastNumber - inputNumbers) == 2 || Math.abs(lastNumber - inputNumbers) == 6 || Math.abs(lastNumber - inputNumbers) == 4) {
			result = 2;
		} else if(Math.abs(lastNumber - inputNumbers) == 5 || Math.abs(lastNumber - inputNumbers) == 9 || Math.abs(lastNumber - inputNumbers) == 7) {
			result = 3;
		} else if(Math.abs(lastNumber - inputNumbers) == 8 || Math.abs(lastNumber - inputNumbers) == 10) {
			result = 4;
		}
    	
    	return result;
    }
    
    
}

public class Keypad {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		s.solution(numbers, hand);

	}

}

package BlocksJump;

public class BlocksJump {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question
		// There are N block from 0 to N-1. A couple of frogs were sitting together on
		// one block, They had a quarrel and need to jump away from one another. The
		// frogs can only jump to another block if the height of the other block is
		// greater than equal to the current one. You need to find the longest possible
		// distance that they can possible create between each other, if they also
		// choose to sit on an optimal starting block initially.
		int[] i = {1, 5, 5, 2, 6};
		System.out.println(getDistance(i));
	}

	public static int getDistance(int[] blocks) {
		int result = 0;
		for (int i = 0; i < blocks.length; i++) {
			int left = i;
			int right = i;
			
			while(right + 1 < blocks.length && blocks[right] <= blocks[right+1]) {
				right++;
			}
			while(left - 1 > 0 && blocks[left] <= blocks[left-1]) {
				left--;
			}
			result = Math.max(result, right-left+1);
			result = Math.max(result, right - left + 1);
		}
		return result;
	}
}

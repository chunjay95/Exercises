package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int x = 0; x < nums.length; x++) {
			Integer result = target - nums[x];
			
			if(map.containsKey(result)) {
				int[] intArray = {x, map.get(result)};
				return intArray;
			}
			
			map.put(nums[x], x);
		}
		
		return null;
	}

}

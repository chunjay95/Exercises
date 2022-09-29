package MedianofTwoSortedArrays;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 3 };
		int[] nums2 = { 2, 4 };

		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double medianResult;
		int length1 = nums1.length;
		int length2 = nums2.length;

		int[] result = new int[length1 + length2];
		System.arraycopy(nums1, 0, result, 0, length1);
		System.arraycopy(nums2, 0, result, length1, length2);
		Arrays.sort(result);

		medianResult = result.length % 2 == 0
				? (double) (result[(result.length / 2) - 1] + result[result.length / 2]) / 2
				: result[result.length / 2];

		return medianResult;
	}

}

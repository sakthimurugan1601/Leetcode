class Solution {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = mergeArrays(nums1, nums2);
		int resLength = result.length;

		if (resLength % 2 == 0){
			return (result[resLength / 2 - 1] + result[resLength / 2]) / 2.0;
		} else {
			return result[resLength / 2];
		}
	}


	private static int[] mergeArrays(int[] nums1, int[] nums2) {

		int[] result = new int[nums1.length + nums2.length];
		int counter = 0;

		int index1 = 0;
		int index2 = 0;

		while (index1 < nums1.length || index2 < nums2.length) {

			if (index2 < nums2.length && (index1 >= nums1.length || nums1[index1] > nums2[index2])) {
				result[counter++] = nums2[index2++];
			} else {
				result[counter++] = nums1[index1++];
			}
		}
		return result;
	}
}
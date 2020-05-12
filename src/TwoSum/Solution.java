package TwoSum;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        int currentIndex1 = 0;
        int currentIndex2 = 0;
        for (int num : nums) {
            for (int _num : nums) {
                if (_num == target - num && currentIndex1 != currentIndex2) {
                    indexes[0] = currentIndex1;
                    indexes[1] = currentIndex2;
                    return indexes;
                }
                currentIndex2++;
            }
            currentIndex2 = 0;
            currentIndex1++;
        }
        return null;
    }
}
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int result = 0;
        int position = 0;

        for (int num : nums) {
            position += num;
            if (position == 0)
                result++;
        }

        return result;
    }
}
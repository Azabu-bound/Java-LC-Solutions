class NumArray {
    private int[] prefixSum;


    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];

        int total = 0;
        for (int i = 0; i < n; ++i) {
            total += nums[i];
            prefixSum[i] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        int preRight = prefixSum[right];
        int preLeft = left > 0 ? prefixSum[left - 1] : 0;
        return preRight - preLeft;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
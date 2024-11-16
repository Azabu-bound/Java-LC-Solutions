class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap {value : index}
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        int[] res = new int[2];

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int value = nums[i]; // 7
            int difference = target - value; // 2
            if (prevMap.containsKey(difference)) {
                res[0] = prevMap.get(difference);
                res[1] = i;
                break;
            }
            prevMap.put(value, i);
        }
        return res;
    }
}
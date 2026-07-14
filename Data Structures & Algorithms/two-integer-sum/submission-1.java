class Solution {
    public int[] twoSum(int[] nums, int target) {
       if (nums.length == 2) {
        return new int[]{0,1};
       }
       int[] result = new int[2];
       Set<Integer> pair = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
        if (pair.contains(target - nums[i])) {
            result[1] = i;
            break;
        }
        pair.add(nums[i]);
       }
       for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target - nums[result[1]]) {
            result[0] = i;
            break;
        }
       }
       return result;
    }
}

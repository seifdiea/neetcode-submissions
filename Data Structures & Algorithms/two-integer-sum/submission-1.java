class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSum = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (twoSum.containsKey(nums[i])) {
                return new int[]{twoSum.get(nums[i]), i};
            }

            twoSum.put(complement, i);
        }
        return null;
    }
}

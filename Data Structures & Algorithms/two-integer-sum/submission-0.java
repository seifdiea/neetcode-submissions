class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sums = new HashMap<>();
        int [] result = new int[2];
        for(int i = 0; i<nums.length;i++){
            int diff = target - nums[i];
            if(sums.containsKey(diff)){
                return new int[]{Math.min(i, sums.get(diff)), Math.max(i, sums.get(diff))};
            }
            sums.put(nums[i], i);
        }
        return new int[]{};
    }
}

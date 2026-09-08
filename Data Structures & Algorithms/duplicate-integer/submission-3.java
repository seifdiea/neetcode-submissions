class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> occ = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!occ.add(nums[i])) return true;
        }
        return false; 
    }
}
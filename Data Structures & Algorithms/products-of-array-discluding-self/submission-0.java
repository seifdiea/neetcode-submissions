class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] out = new int[nums.length];

        prefix[0] = 1;
        suffix[nums.length-1] = 1;

        for(int i = 1; i<nums.length;i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for(int j = nums.length-2;j>-1;j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }

        out[0] = suffix[0];
        out[nums.length-1] = prefix[nums.length-1];
        for(int z = 1; z<nums.length-1;z++){
            out[z] = prefix[z] * suffix[z];
        }

        return out;

    }
}  

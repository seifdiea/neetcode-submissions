class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        int[] res= new int[nums.length];

        
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            prefixProd[i] = prefix;
            suffixProd[nums.length-i-1] = suffix;
            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
        }
       
        for(int i=0;i<nums.length;i++){
            res[i] = suffixProd[i] * prefixProd[i];
        }

        return res;
        
    }
}  

class Solution {
    public int trap(int[] height) {
        
        if(height.length<3)
            return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        int rMax=Integer.MIN_VALUE;
        int lMax=Integer.MIN_VALUE;

        for(int i=0;i<height.length;i++){
            if(height[i]>lMax)
                lMax=height[i];
            if(height[height.length-1-i]>rMax)
                rMax = height[height.length-1-i];
            leftMax[i] = lMax;
            rightMax[height.length-1-i] = rMax;
        }

       int sum = 0;
       for(int j=0;j<height.length;j++){
        int num = height[j];
        int h = Math.min(leftMax[j], rightMax[j]) - num;

        if(h>0)
            sum+=h;
       }

       return sum;
    }
}

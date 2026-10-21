class Solution {
    public int maxArea(int[] heights) {

        int i=0;
        int j=heights.length-1;
        int maxArea=Math.min(heights[i], heights[j])*(j-i);
        while(i<j){
            int currArea = Math.min(heights[i], heights[j])*(j-i);
            if(heights[i]>heights[j]){
                j--;
            }
            else if(heights[j]>heights[i]){
                i++;
            }
            else{
                i++;
            }

            maxArea = (currArea>maxArea)?currArea:maxArea;

        }

        return maxArea;
        
    }
}

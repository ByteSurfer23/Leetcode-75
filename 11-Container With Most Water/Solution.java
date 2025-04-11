class Solution {
    public int maxArea(int[] height) {
        // here we try to initialize 2 pointers 
        // one is  on the start and the other in the end of the array 
        // the goal is try and find out the greatest area 
        // now the condition for moving the pointer is that 
        // if the left pointer is smaller than the right then it must move 1 step forward 
        // if right pointer is smaller than the left then it must move 1 step forward 
        
        int maxArea = 0; 
        int lp = 0; 
        int rp = height.length-1; 
        int temp = 0;
        while(lp<rp){
            temp = Math.min(height[lp] , height[rp]) * (rp-lp);
            maxArea = Math.max(temp,maxArea);

            if(height[lp]<height[rp]){
                lp+=1;
            }
            else{
                rp-=1;
            }
        }
        return maxArea;
    }
}
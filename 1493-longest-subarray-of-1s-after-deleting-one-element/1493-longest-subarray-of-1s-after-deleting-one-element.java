class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int countZeroes=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                countZeroes+=1;
            }
            while(countZeroes>1){
               if(nums[left]==0){
                countZeroes-=1;
               }
               left++; 
            }
            if(countZeroes<=1){
                max=Math.max(max,right-left);
            }
        }
        return max==0 ? 0: max;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
      int left=0;
      int countZeroes=0;
      int max=0;
      for(int right=0;right<nums.length;right++){
        if(nums[right]==0){
            countZeroes+=1;
        }
        while(countZeroes>k){
            if(nums[left]==0){
                countZeroes-=1;
            }
            left++;
        }
        if(countZeroes<=k){
           max=Math.max(max,right-left+1);
        }
    }
    return max;  
}
}
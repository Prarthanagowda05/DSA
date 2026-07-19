class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int firstSum=0;
        int currentSum=0;
        int maxSum=0;
        for(int i=0;i<k&&i<nums.length;i++){
            firstSum+=nums[i];
            currentSum=firstSum;
            maxSum=firstSum;
        }
        for(int i=k; i<nums.length; i++){
            currentSum=currentSum-nums[i-k]+nums[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        double ans=(double) maxSum/k;
        return ans;
    }
}
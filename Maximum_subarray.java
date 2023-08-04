//  Maximum Subarray
// Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        //using Kadane's Algorithm
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<=nums.length-1;i++){
            sum += nums[i];
            if(max < sum){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
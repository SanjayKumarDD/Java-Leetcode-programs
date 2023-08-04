// Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0;
        while(mid<= high){
            if(nums[mid] == 0){
                 nums[mid] = nums[low];
                nums[low] = 0;
               
                low++;
            }
            if(nums[mid] == 2){
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
                mid--;
            }
            mid++;
        }
    }
}
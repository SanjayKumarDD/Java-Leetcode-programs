// Next Permutation
// A permutation of an array of integers is an arrangement
//  of its members into a sequence or linear order.

class Solution {
    public void nextPermutation(int[] nums) {
        
        int pos = -1, n = nums.length;
        for(int i = n-2 ;i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                pos = i;
              
                break;
            }
        }
        if(pos == -1){
            reverse(0,n-1,nums);
        }
        else{
            int maxIndex = -1;
            int max = Integer.MAX_VALUE;
        for(int i = n-1;i>pos;i--){
            if(nums[i] > nums[pos] && nums[i]< max){
                max = nums[i];
                maxIndex = i;
            }
        }
        int temp = nums[pos] ;
        nums[pos] = nums[maxIndex];
        nums[maxIndex] = temp;

        int l = nums.length;
        reverse(pos+1,l-1,nums);
        }
    }
    public void reverse(int pos, int l,int[] nums){
         while(pos<l){
            int temp = nums[pos];
            nums[pos] = nums[l];
            nums[l] = temp;
            pos++;
            l--;
        }
    }
}
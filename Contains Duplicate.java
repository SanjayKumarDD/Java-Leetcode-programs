// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> obj = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(obj.contains(nums[i])){
                return true;
                
            }
            obj.add(nums[i]);
        }
        return  false;
    }
}

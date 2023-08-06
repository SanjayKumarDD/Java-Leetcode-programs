// 169.Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            if(map.get(nums[i]) != null){
             count = map.get(nums[i]);
            }
            map.put(nums[i],count+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > nums.length/2){
                return key;
            }
        }
        return 0;
    }

}
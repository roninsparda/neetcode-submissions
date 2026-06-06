class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       return nums[nums.length/2];
    }
}

//1 1 1 5 5 5 5
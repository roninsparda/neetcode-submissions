class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int ans = nums[0];

       for(int i : nums){
        map.put(i, map.getOrDefault(i,0)+1);
       }

       for(Integer i : map.keySet()){
        if(map.get(i) > nums.length/2){
            ans = Integer.valueOf(i);
            break;
        }
       }
        return ans;
    }
}
//nums=[1,2,3,2,2,2,5,4,2]
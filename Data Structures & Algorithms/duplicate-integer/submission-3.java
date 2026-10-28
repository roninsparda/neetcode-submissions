class Solution {
    public boolean hasDuplicate(int[] nums) {
        //using hashmap

        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i< nums.length; i++){
            if(map != null && map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i],i);
        }

        return false;
    }
}
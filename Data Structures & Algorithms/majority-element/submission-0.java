class Solution {
    public int majorityElement(int[] nums) {
        int app = nums.length / 2;
        Arrays.sort(nums);
        int ans = nums[0];
       int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                 if(count > app){
                    ans = nums[i-1];
                    break;
                }
            }
           
            
             else{   
                count = 1;
             }
            }
        
        return ans;
    }
}

//1 1 1 5 5 5 5
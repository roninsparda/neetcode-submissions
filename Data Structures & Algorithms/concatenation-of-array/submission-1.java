class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int concatArray[] = new int[length * 2];

        
        for(int i = 0;i < length;i++){
            concatArray[i] = nums[i];
            concatArray[i+length] = nums[i];

            
        }

        return concatArray;
    }
}
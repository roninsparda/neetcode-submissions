class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int concatArray[] = new int[length * 2];

        int i = 0;
        while(i < length){
            concatArray[i] = nums[i];
            concatArray[i+length] = nums[i];

            i++;
        }

        return concatArray;
    }
}
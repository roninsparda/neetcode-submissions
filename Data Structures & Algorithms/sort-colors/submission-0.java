class Solution {
    public void sortColors(int[] nums) {
        int countArray[] = new int[3];
        for(int i : nums){
            countArray[i]++;
        }
        int index = 0;
        for(int i = 0 ; i < countArray.length;i++){
            while(countArray[i] > 0){
                nums[index++] = i;
                countArray[i]--; 
            }
        }
    }
}
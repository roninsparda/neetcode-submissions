class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //return Arrays.stream(arr)
                   //  .anyMatch(n -> !seen.add(n))

        return Arrays.stream(nums).anyMatch(n -> !set.add(n));

    
    }
}
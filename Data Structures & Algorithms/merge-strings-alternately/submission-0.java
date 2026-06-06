class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0,  len1 = word1.length(), len2 = word2.length();
        String mergedString = "";

        while(i < len1 && j < len2){

            mergedString = mergedString + word1.charAt(i++)+word2.charAt(j++);

        }

        if(i < len1){
            mergedString = mergedString + word1.substring(i);
        }
        if(j < len2){
            mergedString = mergedString+ word2.substring(j);
        }

        return mergedString;
    }
}
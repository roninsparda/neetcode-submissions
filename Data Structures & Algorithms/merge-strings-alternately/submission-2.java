class Solution {
    public String mergeAlternately(String word1, String word2) {
        int k = 0,  len1 = word1.length(), len2 = word2.length();
        String mergedString = "";

        while(k < len1 && k < len2){

            mergedString = mergedString + word1.charAt(k)+word2.charAt(k);
            k++;

        }

        if(k < len1){
            mergedString = mergedString + word1.substring(k,word1.length());
        }
        if(k < len2){
            mergedString = mergedString+ word2.substring(k,word2.length());
        }

        return mergedString;
    }
}
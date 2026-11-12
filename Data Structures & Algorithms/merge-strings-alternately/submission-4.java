class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        int i = 0, j = 0;
        String ans = "";
        while(i < m && j < n ){
            ans = ans + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }

        if(i < m){
            ans = ans + word1.substring(i,m);
        }

        else if(j < n){
            ans = ans + word2.substring(j,n);
        }

        return ans;
    }
}
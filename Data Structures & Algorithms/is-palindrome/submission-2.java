class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int l = 0, r = s.length() - 1;

        while( l < r){
            char m = s.charAt(l);
            char n = s.charAt(r);
            if(!isAlphaNumeric(m))
                l++;
            else if(!isAlphaNumeric(n))
                r--;
            else{
            if(m != n){
                return false;
            }
                l++;
                r--;
            
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c){
        return ((c >='a' && c <='z') || 
                    (c >= 'A' && c<= 'Z')||
                    (c >= '0' && c <= '9'));
    }
}

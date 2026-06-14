class Solution {
    public int mySqrt(int x) {
       int l = 1, r = x, ans = 0;
       if( x == 1 )
       return x;
       while( l <= r) {
            int mid = l +(r-l)/2;
            if((long)mid * mid == x){
                return mid;
            }
            else if((long) mid * mid < x){
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid  - 1;
            }
       }

       return ans;

    }
}
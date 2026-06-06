class Solution {
    public boolean isPalindrome(String s) {
        //two pointer 

        int  i = 0, j = s.length()-1;
        String t = s.toLowerCase();

        while(i < j){
            //check  
            char c = t.charAt(i);
            char x = t.charAt(j);
           if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))){
               // System.out.println("Here 1 "+t.charAt(i));
                i++;
                
            }
            else  if(!((x >= 'a' && c <= 'z') || (x >= 'A' && c <= 'Z') || (x >= '0' && c <= '9'))){
              //  System.out.println("Here 2 "+t.charAt(j));
                j--;
            }
            else{
             //   System.out.println("Here 3 "+ (t.charAt(i))+" "+(t.charAt(j)));
                
                if(t.charAt(i) != t.charAt(j))
                    return false;
                
                i++;
                j--;
            }
        }

        return true;
    }
}

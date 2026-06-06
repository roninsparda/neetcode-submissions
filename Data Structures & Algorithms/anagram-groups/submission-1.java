class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        

        for(int i = 0; i < strs.length ; i++){
            if(strs[i] == null )continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
             for(int j = i+1; j < strs.length; j++){
                
                if(strs[j] != null && isAnagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    strs[j] = null;
                }
    
             }
              ans.add(temp);
        }
        return ans;
    }

    public boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int charArray [] = new int[26];
        for(int i = 0; i < str1.length(); i++){
            charArray[str1.charAt(i)-'a']++;
            charArray[str2.charAt(i)-'a']--;

        }

        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] != 0){
                return false;
            }
        }
    return true;
    }
}
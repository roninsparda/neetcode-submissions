class Solution {

    public String encode(List<String> strs) {
        if(strs.size()== 0) 
            return "";

        StringBuilder res = new StringBuilder();

        List<Integer> size = new ArrayList<>();

        for(String s : strs){
            size.add(s.length());
        }
        for(int i : size){
            res.append(i);
            res.append(",");
        }
        res.append("#");
        for(String s : strs){
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
         if(str.length()== 0) 
            return new ArrayList<>();

        List<String> res = new ArrayList<>();
        int i  = 0;
         List<Integer> size = new ArrayList<>();
        while(str.charAt(i)!= '#'){
            StringBuilder sizeCur = new StringBuilder();
            while(str.charAt(i) != ','){
                sizeCur.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(sizeCur.toString()));
            i++;
        }
        i++;
        for(int len :size){
            res.add(str.substring(i,i+len));
            i = i + len;
        }

        return res;
    }
}

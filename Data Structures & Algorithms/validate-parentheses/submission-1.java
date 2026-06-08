class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char [] sArr = s.toCharArray();


        for(char c : sArr){
           
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(c == '}'){
                if(stack.empty() || stack.peek() != '{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
             else if(c == ']'){
              
                if(stack.empty() || stack.peek() != '['){
                    return false;
                }
                else{
                    stack.pop();
                }
            }

        }

        return stack.empty();
        
    }
}

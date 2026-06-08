class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();

        for(String s : operations){
            if(!"D".equals(s) &&  !"C".equals(s) && !"+".equals(s) ){
                stack.push(Integer.parseInt(s));
            }
            else if("+".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                int sum = a+b;

                stack.push(b);
                stack.push(a);
                stack.push(sum);
            }
            else if("C".equals(s)){
                stack.pop();
            }
            else{
                stack.push(2*stack.peek());
            }
        }

            int totalSum =0;
            for(int i : stack){
                totalSum += i;
            }
             return totalSum;
        
    }
}
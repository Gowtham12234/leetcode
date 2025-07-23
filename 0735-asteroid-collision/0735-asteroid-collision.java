class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int ast:asteroids){
            if(stack.isEmpty() || ast>0){
                stack.push(ast);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<-ast){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()==-ast){
                    stack.pop();
                }
                else if(stack.isEmpty()|| stack.peek()<0){
                        stack.push(ast);
                }
            }
        }
        int[] res=new int[stack.size()];
        for(int i=res.length-1 ;i>=0;i-- ){
            res[i]=stack.pop();
        }
        return res;
    }
}
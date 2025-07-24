class Solution {
    public String decodeString(String s) {
        Stack<String> str=new Stack<>();
        Stack<Integer> num=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int k=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                num.push(k);
                str.push(curr.toString());
                curr=new StringBuilder();
                k=0;
            }else if(c==']'){
                int repeat=num.pop();
                StringBuilder decode=new StringBuilder(str.pop());
                for(int i=0;i<repeat;i++){
                    decode.append(curr);
                }
                curr=decode;
            }else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
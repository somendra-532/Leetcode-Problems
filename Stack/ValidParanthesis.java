class Solution {
    public boolean isValid(String s) {
        char[] stack=new char[s.length()];
        int top=-1;
        for(char c:s.toCharArray()){
            switch(c){
                case'(':
                stack[++top]=')';
                break;
                case'[':
                stack[++top]=']';
                break;
                case'{':
                stack[++top]='}';
                break;
                default:
                if(top<0||stack[top--]!=c){
                    return false;
                }
            }
        }
        return top==-1;
        
    }
}

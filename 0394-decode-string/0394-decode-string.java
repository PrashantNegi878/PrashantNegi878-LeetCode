class Solution {
    public String decodeString(String s) {
        int l=s.length();
        String substr="";
        Deque<String> stack = new ArrayDeque<>();
        for(int i=0;i<l;i++)
        {
            substr="";
            if(s.charAt(i)==']')
            {
                while(!stack.peek().equals("["))
                    substr=stack.pop()+substr;
                stack.pop();
                String num="";
                while(stack.peek()!=null && stack.peek().matches("-?\\d+(\\.\\d+)?"))
                    num=stack.pop()+num;
                Integer num2=Integer.parseInt(num);
                while (num2>0)
                    {stack.push(substr);
                    num2--;}
            }
            else
            stack.push(""+s.charAt(i));
        }
        substr="";
        while(stack.peek()!=null)
            substr=stack.remove()+substr;
        return substr;
    }
}
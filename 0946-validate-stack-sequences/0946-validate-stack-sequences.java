class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int l=pushed.length;
        int i=0,j=0;
        Deque<Integer> stack = new ArrayDeque<>();
        while(i<l || j<l)
        {
            if(stack.peek()!=null && (popped[j]==stack.peek()))
            {
                stack.poll();
                j++;
            }
            else if(i<l && popped[j] == pushed[i])
            {
                i++;
                j++;
            }   
            else 
            {
                if(i >= l){
                    System.out.println(i);
                    return false;
                }
                stack.push(pushed[i]);
                i++;
            }
        }
        System.out.println(stack.size());
        if(stack.size()==0)
            return true;
        return false;
    }
}
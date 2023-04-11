class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
                stack.poll();
            else
                stack.push(s.charAt(i));
        }

        while(stack.peek()!=null)
            sb.append(stack.pollLast());

        return sb.toString();
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
            Deque<Character> ss = new ArrayDeque<>();
            Deque<Character> ts = new ArrayDeque<>();
            int ls=s.length(), lt=t.length();
            char target='#';
            String sresult="",tresult="";
            for(int i=0;i<ls;i++)
            {
                if(s.charAt(i)==target)
                    ss.poll();
                else
                    ss.push(s.charAt(i));
            }
            for(int i=0;i<lt;i++)
            {
                if(t.charAt(i)==target)
                    ts.poll();
                else
                    ts.push(t.charAt(i));
            }
            
            while((!ss.isEmpty()) && ss.peek()==ts.peek())
                {
                    ss.poll();
                    ts.poll();
                }
            if(ss.isEmpty() && ts.isEmpty())
                return true;
            return false;
    }
}
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i: asteroids){
            if(i > 0)
                s.push(i);
            else
            {
            // i is negative
            while(!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(i))
                s.pop();
            if(s.isEmpty() || s.peek() < 0){
                s.push(i);
            }
            else if(i + s.peek() == 0)
                s.pop(); //equal
            }
        }
        
        return convertStackToIntArray(s);
    }

    public int[] convertStackToIntArray(Deque<Integer> stack)
    {
        int[] res=new int[stack.size()];
        for(int j=stack.size()-1;j>=0;j--)
        {
            res[j]=stack.poll();
        }
        return res;
    }
}
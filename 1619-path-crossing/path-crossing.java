class Solution {
    class Pair{
        int x, y;
        Pair(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
        public boolean equals(Object x)
        {
            Pair p =(Pair) x;
            return (p.x==this.x && p.y==this.y);
        }
        public int hashCode() {
            return x^y;
        }
    }
    public boolean isPathCrossing(String path) {
        Set<Pair> s = new HashSet<>();
        s.add(new Pair(0,0));
        Integer x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N') y+=1;
            else if(path.charAt(i)=='E') x+=1;
            else if(path.charAt(i)=='W') x-=1;
            else if(path.charAt(i)=='S') y-=1;
            if(s.contains(new Pair(x,y))) return true;
            else s.add(new Pair(x,y));
        }   
        return false;
    }
}
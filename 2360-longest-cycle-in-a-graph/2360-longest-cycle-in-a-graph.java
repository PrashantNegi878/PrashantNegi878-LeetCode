class Solution {
    int result=-1;
    boolean[] visited;
    boolean[] extra;
    public int longestCycle(int[] edges) 
    {
        visited = new boolean[edges.length];
        extra = new boolean[edges.length];
        int[] dist_node = new int[edges.length];
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
            dfs(i,dist_node,visited,edges,0);
        }     
        return result;
    }
    
    void dfs(int current,int[] dist_node,boolean[] visited,int[] edges,int distance)
    {
        if(current!=-1)
        {
            if(!visited[current])
            {
                visited[current]=true;
                extra[current] = true;
                dist_node[current] = distance;
                dfs(edges[current],dist_node,visited,edges,distance+1);
            }
            else if (extra[current])
            {
                result=Math.max(result, distance-dist_node[current]);
            }
            extra[current]=false;
        }
    }
}
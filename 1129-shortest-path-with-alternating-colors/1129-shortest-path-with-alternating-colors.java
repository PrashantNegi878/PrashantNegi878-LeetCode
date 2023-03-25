class Solution {

    public class Node{
        public int number;
        List<Integer> blueCities;
        List<Integer> redCities;

        public Node(int number){
            this.number = number;
            blueCities = new ArrayList<>();
            redCities = new ArrayList<>();
        }

    }

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer,Node> hm  = new HashMap<>();
        for(int i=0;i<n;i++)
            hm.put(i,new Node(i));
        
        for(int[] redEdge : redEdges)
            hm.get(redEdge[0]).redCities.add(redEdge[1]);

        for(int[] blueEdge : blueEdges)
            hm.get(blueEdge[0]).blueCities.add(blueEdge[1]);

        int [] result = new int[n];
        Arrays.fill(result,-1);
        boolean[][] visited = new boolean[n][2];
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[] { 0, 0, -1 });
        result[0] = 0;
        visited[0][1] = visited[0][0] = true;

        while(!q.isEmpty())
        {
            int[] currElement = q.poll();
            int nodeNumber = currElement[0];
            int steps = currElement[1];
            int prevColor = currElement[2];

            for(Integer neighbor: hm.get(nodeNumber).redCities){
                if(!visited[neighbor][0] && prevColor!=0){
                    if(result[neighbor] == -1) result[neighbor] = 1 + steps;
                    visited[neighbor][0] = true;
                    q.add(new int[]{neighbor,1+steps,0});
                }
            }

            for(Integer neighbor: hm.get(nodeNumber).blueCities){
                if(!visited[neighbor][1] && prevColor!=1){
                    if(result[neighbor] == -1) result[neighbor] = 1 + steps;
                    visited[neighbor][1] = true;
                    q.add(new int[]{neighbor,1+steps,1});
                }
            }
        }
        return result;
    }
}
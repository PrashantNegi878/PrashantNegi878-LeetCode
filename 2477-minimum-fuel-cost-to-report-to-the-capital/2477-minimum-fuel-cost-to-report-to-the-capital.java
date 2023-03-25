class Solution {

    long fuel = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph = new List[roads.length + 1];

        for (int i = 0; i < graph.length; ++i)
        graph[i] = new ArrayList<>();

        for (int[] road : roads) {
        int curr = road[0];
        int neighbor = road[1];
        graph[curr].add(neighbor);
        graph[neighbor].add(curr);
        }

        dfs(graph, 0, -1, seats);
        return fuel;
    }

    public int dfs(List<Integer>[] graph, int curr, int prev, int seats) {
        int people = 1;
        for (int neighbor : graph[curr]) {
        if (neighbor != prev)
        people += dfs(graph, neighbor, curr, seats);
        }
        if (curr > 0)
        // # of cars needed = ceil(people / seats)
        fuel += (people + seats - 1) / seats;
        return people;
    }
}
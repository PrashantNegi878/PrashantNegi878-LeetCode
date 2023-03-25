class Solution {
    public int minScore(int n, int[][] roads) {
		HashMap<Integer, List<int[]>> map = new HashMap<>();
		for (int[] road : roads) {
			map.computeIfAbsent(road[0],
            t -> new ArrayList<>()).add(new int[] { road[1], road[2] });
			map.computeIfAbsent(road[1], 
            t -> new ArrayList<>()).add(new int[] { road[0], road[2] });
		}
		return minScore(1, map);
	}

	private int minScore(int n, HashMap<Integer, List<int[]>> map) {
		int min = Integer.MAX_VALUE;
		for (int[] next : map.replace(n, List.of())) {
			min = Math.min(min, Math.min(next[1], minScore(next[0], map)));
		}
		return min;
	}
}
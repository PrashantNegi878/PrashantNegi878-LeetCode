class Solution {
    public int minJumps(int[] arr) {

        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
        {
            List<Integer> temp = hm.getOrDefault(arr[i], new ArrayList<>()); 
            temp.add(i);
            hm.put(arr[i], temp);
        }
        int steps = 0;
        boolean vis[] = new boolean[arr.length];
        vis[0] = true;
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) 
            {
                int curridx = qu.poll();
                if (curridx == arr.length - 1) return steps;
                List<Integer> jumptoindexes = hm.get(arr[curridx]);
                if (curridx != 0) jumptoindexes.add(curridx - 1); 
                // Check here vs inside the for loop below
                jumptoindexes.add(curridx + 1); 
                // No need to check, Program returns steps 3 lines above
                for (int q : jumptoindexes) 
                {
                    if (!vis[q]) 
                    { 
                        // two less logical checks inside the for loop
                        vis[q] = true;
                        qu.add(q);
                    }
                }
                jumptoindexes.clear();
            }
            steps++;
        }
        return -1;
    }
}
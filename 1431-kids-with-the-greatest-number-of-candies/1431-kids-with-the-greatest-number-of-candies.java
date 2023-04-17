class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i : candies)
            max=Math.max(max,i);
        List<Boolean> results = new ArrayList<>();
        for(int i: candies)
            if((i+extraCandies)>=max)
                results.add(true);
            else
                results.add(false);
        return results;
    }
}
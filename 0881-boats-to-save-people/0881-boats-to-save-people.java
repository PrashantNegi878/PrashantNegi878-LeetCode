class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int i=0;
        int j=people.length-1;
        int count=0;
        while(i<=j)
        {
            int currSum=people[j];
            if(currSum+people[i]<=limit)
            {
                currSum+=people[i];
                i++;
            }
            j--;
            count++;  
        }
        return count;
    }
}
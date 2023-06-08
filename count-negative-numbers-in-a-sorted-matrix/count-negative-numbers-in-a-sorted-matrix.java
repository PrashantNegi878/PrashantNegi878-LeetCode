class Solution {
    public int countNegatives(int[][] grid) {
        int total=0;
        for(int[] arr: grid)
        {
            for(int i=0;i<arr.length;i++)
                if(arr[i]<0)
                {
                    total+=arr.length-i;
                    break;
                }
        }
        return total;
    }
}
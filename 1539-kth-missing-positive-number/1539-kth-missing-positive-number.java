class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1,count=0,result=0;
        int missingCount=0;
        while(missingCount<k)
            if (count>=arr.length || i!=arr[count])
            {
                missingCount+=1;
                result=i;
                i++;
            } 
            else
            {
                i++;
                count++;
            }   

        return result;
    }
}
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int total=0;
        int l=time.length;
        int arr[] = new int[60];
        for(int i=0;i<l;i++){
            time[i]%=60;
            if(arr[ (60 - time[i]) % 60] != 0){
                total+= arr[(60 - time[i]) % 60];
            }
            arr[time[i]] += 1; 
            
        }
        return total;
    }
}
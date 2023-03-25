class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums,int l,int r)
    {
        if(l<r)
        {
            int m=(r-l)/2+l;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            sort(nums,l,m,r);
        }
    }

    public static void sort(int[] nums, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = nums[l + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = nums[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> al = new LinkedList<>();
        int i=num.length-1;
        int carry=0,sum;
        while(k>0 || i>=0)
        {
            if (i>=0)
                sum=num[i]+k%10+carry;
            else
                sum=k%10+carry;
            carry=sum/10;
            al.addFirst(sum%10);
            i-=1;
            k=k/10;
        }
        if (carry>0)
            al.addFirst(carry);
        
        return al;
    }
}
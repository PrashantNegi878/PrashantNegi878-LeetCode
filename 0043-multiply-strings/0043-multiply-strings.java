class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int l1=num1.length(),l2=num2.length();
        int[] result = new int[l1+l2];
        StringBuilder n1 = new StringBuilder(num1);
        n1.reverse();
        StringBuilder n2 = new StringBuilder(num2);
        n2.reverse();
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                int temp=(n1.charAt(i)-'0')*(n2.charAt(j)-'0');
                result[i+j]+=temp;
                result[i+j+1]+=result[i+j]/10;
                result[i+j]=result[i+j]%10;
            }
        }
        String res="";
        for(int i : result)
            res+=Integer.toString(i);
        int i=0;
        StringBuilder n3= new StringBuilder(res);
        n3=n3.reverse();
        for( i=0;i<n3.length();i++)
            if(n3.charAt(i)!='0')
            break;
        res=n3.toString();
        res=res.substring(i);
        return res; 
    }
}
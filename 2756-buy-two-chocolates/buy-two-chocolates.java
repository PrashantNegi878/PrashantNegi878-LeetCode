class Solution {
    public int buyChoco(int[] prices, int money) {
        int num1=prices[0],num2=prices[1];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<num1)
            {
                num2=num1;
                num1=prices[i];
            }
            else if(prices[i]<num2)
            num2=prices[i];
        }
        int sum=num1+num2;
        return (money-sum>=0)? money-sum : money;
    }
}
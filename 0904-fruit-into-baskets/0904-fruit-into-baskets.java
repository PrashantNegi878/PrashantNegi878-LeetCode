class Solution {
    public int totalFruit(int[] fruits) {
        int a = -1, ca = 0, b = 0, cb = 0, max = 0;
        for(int i = 0; i < fruits.length; i++){      
            if(a != -1 && fruits[a] == fruits[i]){        
                a = i;        
                ca ++;      
                }      
                else if(fruits[b] == fruits[i])
                {        
                    b = i;        
                    cb ++;      
                }      
                else
                {        
                    int temp = i-1;        
                    if(a != -1 && temp == a)
                    {          
                        ca = a - b;          
                        b = i ;          
                        cb = 1;        
                    }        
                    else
                    {          
                        cb = b - a;          
                        a = i;          
                        ca = 1;        
                    }      
                }      
                    max = Math.max(max,(ca+cb));    
        }
        return max;  
    }
}
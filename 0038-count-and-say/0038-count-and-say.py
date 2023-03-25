class Solution(object):
    def countAndSay(self, n):
        counter=1
        temp=""
        
        if n==1:
            return "1"
        if n==2:
            return "11"
        s="11"
        # stringg=""
        for i in range(2,n):
            s=s+"&"
            temp=""
            for j in range(1,len(s)):
                if s[j]==s[j-1]:
                    counter+=1
                else:
                    temp=temp+str(counter)+str(s[j-1])
                    counter=1
            s=temp
                
        return(s)
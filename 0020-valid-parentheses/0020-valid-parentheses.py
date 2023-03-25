class Solution(object):
    def isValid(self, s):
        recent=""
        l=-1
        arr=[]
        result="true"
        for i in s:
            # print(i)
            if i=="(" or i=="{" or i=="[":
                arr.append(i)
                l+=1
            if l==-1 and (i==")" or i=="}" or i=="]"):
                result="false"
                break
            if l>-1:
                if i==")":
                    if arr[l]=="(":
                        arr.pop()
                        l-=1  
                    else:
                        result="false"
                        break
                if i=="}":
                    if arr[l]=="{":
                        arr.pop()
                        l-=1
                    else:
                        result="false"
                        break
                if i=="]":
                    if arr[l]=="[":
                        arr.pop()
                        l-=1
                    else:
                        result="false"
                        break
        if l>-1:
            result="false"
        if result=="false":
            return 0
        else:
            return 1
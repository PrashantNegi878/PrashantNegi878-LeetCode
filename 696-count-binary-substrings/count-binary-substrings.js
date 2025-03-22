/**
 * @param {string} s
 * @return {number}
 */
var countBinarySubstrings = function(s) {
    let l=s.length;
    let prev=0,curr=1,result=0;
    for(i=1;i<l;i++){
        if(s[i]==s[i-1])
            curr+=1;
        else{
            result+=Math.min(curr,prev);
            prev=curr;
            curr=1;
        }
    }
    return result+=Math.min(curr,prev);
};
/**
 * @param {string} s
 * @return {number}
 */
var minOperations = function(s) {
    let result1=0, result2 = 0;
    let alter=true;
    let arr=s.split("");
    let arr2=s.split("");
    for(let i=0;i<arr.length;i++){
        if(arr[i] == alter){
            result1++;
            arr[i]=Number(!alter);
        } 
        if(arr2[i] == (!alter)){
            result2++;
            arr[i]=Number(alter);
        } 
        alter=!alter;
    }
    return Math.min(result1,result2);
};
/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    const result=[];
    function flatten(arr,n){
        arr.forEach((i)=>{
            if(Array.isArray(i) && n!=0) flatten(i,n-1);
            else result.push(i);
        });
    }
    flatten(arr,n);
    return result;
};
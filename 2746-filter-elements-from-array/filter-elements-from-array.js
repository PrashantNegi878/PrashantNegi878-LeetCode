/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    filteredArr=[];
    for(i=0;i<arr.length;i++){
        fn(arr[i],i)?filteredArr.push(arr[i]):null;
    }
    return filteredArr;
};
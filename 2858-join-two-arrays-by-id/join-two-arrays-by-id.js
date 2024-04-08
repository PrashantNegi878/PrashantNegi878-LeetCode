/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    result={};
    arr1.forEach((i)=>result[i.id]={...result[i.id],...i});
    arr2.forEach((i)=>result[i.id]={...result[i.id],...i});
    return Object.values(result);
};
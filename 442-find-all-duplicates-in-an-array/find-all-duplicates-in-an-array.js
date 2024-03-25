/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    const s=new Set();
    const arr=[];
    nums.forEach((i)=> s.has(i)? arr.push(i):s.add(i));
    return arr;
};
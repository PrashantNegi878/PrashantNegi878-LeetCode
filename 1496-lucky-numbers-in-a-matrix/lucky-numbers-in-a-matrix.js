/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers  = function(matrix) {
    let min=new Set();
    let max=0;
    let result=[];
    for(i=0;i<matrix.length;i++) min.add(Math.min(...matrix[i]));
    for(i=0;i<matrix[0].length;i++) {
        max=0;
        for(j=0;j<matrix.length;j++) {
        max=Math.max(max,matrix[j][i]);
        }
        if(min.has(max)) result.push(max);
    }
    return result;
};
/**
 * @param {number} n
 * @return {number}
 */
var tribonacci = function(n) {
    const result=[0,1,1]

    for(i=3;i<=n;i++)
        result[i]=result[i-3]+result[i-2]+result[i-1];

    return result[n];
};
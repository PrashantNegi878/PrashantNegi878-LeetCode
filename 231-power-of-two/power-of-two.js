/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
    if(n==1)    return true;
    let result=2;
    while (result<n)    result*=2;
    return (result==n)?true:false;
};
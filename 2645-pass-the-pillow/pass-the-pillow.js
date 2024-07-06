/**
 * @param {number} n
 * @param {number} time
 * @return {number}
 */
var passThePillow = function(n, time) {
    const round =Math.floor(time/(n-1))
    if(round%2==0) return (time%(n-1) +1);
    return  n-time%(n-1);
};
/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
    var result=numBottles;
    while(numBottles>=numExchange){
        var full=Math.floor(numBottles/numExchange);
        var empty=Math.floor(numBottles%numExchange)
        result+=full
        numBottles=full+empty;
    }
    return result;
};
/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    result={};
    this.forEach((i)=>{
        groupBy=fn(i);
        result[groupBy]?result[groupBy].push(i) : result[groupBy]=[i];
    });
    return result;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */
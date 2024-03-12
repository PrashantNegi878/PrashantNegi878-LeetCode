/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn){
    const map={}
    return function(...args) {
        if(!(JSON.stringify({...args}) in map))
            map[JSON.stringify({...args})]=fn(...args);
        return map[JSON.stringify({...args})];
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */
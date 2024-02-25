/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    const initValue=init;
    let currValue=initValue;
    return {
        increment(){
            return ++currValue;
        },
        decrement(init){
            return --currValue;
        },
        reset(){
            return currValue=initValue;
        }
    }
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
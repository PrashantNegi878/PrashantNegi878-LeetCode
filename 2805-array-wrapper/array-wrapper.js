/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function(nums) {
    this.result=nums;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function() {
    this.sum=0;
    this.result.forEach((i)=>this.sum+=i);
    return this.sum;
}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function() {
    return `[${this.result.toString()}]`;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */
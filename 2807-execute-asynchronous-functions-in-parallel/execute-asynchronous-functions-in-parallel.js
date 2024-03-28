/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
   return new Promise((resolve,reject)=>{
    const result = [];
    let count=0;
    functions.forEach((f,i)=>{
        f().then(res=>
        {
            count++;
            result[i]=res;
            if(count===functions.length) resolve(result);
        })
        .catch(err=>reject(err));
    });
   });
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */
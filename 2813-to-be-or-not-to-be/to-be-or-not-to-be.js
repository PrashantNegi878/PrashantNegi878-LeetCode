/**
 * @param {string} val
 * @return {Object}
 */
var expect = (val)=>{
    return{
        toBe:(val2)=>{
            if (val2 !== val) throw "Not Equal";
            else return true;
        },
        notToBe:(val2)=>{
            if (val2 === val) throw "Equal";
            else return true;
        }
    };
};
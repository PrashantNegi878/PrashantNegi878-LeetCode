/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const result=[];
    let chunkArr=[];
    arr.forEach((element,i)=>{
        chunkArr.push(element);
        if((i+1)%size===0) {
            console.log(i)
            result.push(chunkArr);
            chunkArr=[];
        }
    });
    if(chunkArr.length>0)result.push(chunkArr);
    return result;
};

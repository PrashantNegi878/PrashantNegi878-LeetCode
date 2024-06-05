var commonChars=(words)=> {
        let minFreq = new Array(26).fill(Infinity);
        
        for (let word of words) {
            let freq = new Array(26).fill(0);
            for (let char of word) {
                freq[char.charCodeAt(0) - 'a'.charCodeAt(0)]++;
            }
            for (let i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }
        
        let result = [];
        for (let i = 0; i < 26; i++) {
            while (minFreq[i]-- > 0) {
                result.push(String.fromCharCode(i + 'a'.charCodeAt(0)));
            }
        }
        return result;
    }
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    if(s == "") return 0;
    else {
        /*DP*/
        let i = 0;
        let j = i;
        let n = s.length;
        let substrings = new Array(n);
        while(i < n) {
            substrings[i] = new Array();
            while(substrings[i].indexOf(s[j]) == -1 && j < n) {
                substrings[i].push(s[j]);
                j++;
            }
            i++;
            j = i;
        }
        return MaxLengthAmongElementsOfArray(substrings);
    }
};
var MaxLengthAmongElementsOfArray = (arr) => {
    let length = [];
    let MAX;
    for(let i = 0; i < arr.length; i++) {
        length.push(arr[i].length);
    }
    MAX = length.sort((a,b)=>{return b-a;})[0];
    arr = null; length = null;
    return MAX;
}
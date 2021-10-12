/**
 Given two integers a and b, return the sum of the two integers without using the operators + and -.

 

Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5
 

Constraints:

-1000 <= a, b <= 1000
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
var getSum = function(a, b) {
    if(a === 0) return b
    if(b === 0) return a
    
    const _sum = a^b
    const _carry = (a&b) << 1
    
    return getSum(_sum, _carry)
};

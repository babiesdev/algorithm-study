/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let carry = 1
    const result = Array(nums.length).fill(1);
    // Add products to result array starting at the front
    for(let i = 0; i < nums.length;i++){
        result[i]*=carry
        carry*=nums[i]
    }
    // Reset carry
    carry = 1
    // Add products to result array starting at the back
    for(let i = nums.length-1; i >= 0; i--){
        result[i]*=carry
        carry*=nums[i]
    }
    
    return result;
};

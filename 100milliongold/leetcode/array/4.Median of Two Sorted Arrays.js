/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    const length1 = nums1.length
    const length2 = nums2.length
    
    let i = 0 , j  = 0, k  = 0
    let nums = new Array(length1 + length2)
    while (i < length1 && j < length2) {
        nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
    }
    if (i == length1) {
        for (; k < nums.length; k++) {
            nums[k] = nums2[j++];
        }
    } else {
        for (; k < nums.length; k++) {
            nums[k] = nums1[i++];
        }
    }
         
    if (nums.length % 2 === 0) {
        return ((nums[nums.length / 2 - 1] + nums[nums.length / 2])) / 2;
    } else{ 
        return nums[Math.floor(nums.length / 2)];
    }
};
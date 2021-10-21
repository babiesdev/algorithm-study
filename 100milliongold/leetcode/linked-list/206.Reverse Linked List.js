/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var reverseList = function(head) {
    let answer = null, point = head;
    
    
    while(point){
        let temp = point.next;
        point.next = answer;
        answer = point;
        point = temp
    }
    
    
    return answer
};
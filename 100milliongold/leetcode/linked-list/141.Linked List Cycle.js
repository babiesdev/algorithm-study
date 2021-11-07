/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 이게 되네???
 */
var hasCycle = function(head) {
    var list= []
    if(head === null )
        return false
    while( head = head.next ){
        if( list.indexOf(head) !== -1){
            return true
        }
        list.push(head);            
    }
    return false
};
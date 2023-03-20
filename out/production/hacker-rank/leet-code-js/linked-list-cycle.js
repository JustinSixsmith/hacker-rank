// Definition for singly-linked list.
function ListNode(val) {
  this.val = val;
  this.next = null;
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function (head) {
  if (head === null || head.next === null) {
    return null;
  }

  let slow = head;
  let fast = head;

  // Find the intersection point of the slow and fast pointers, if exists
  while (fast !== null && fast.next !== null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow === fast) {
      break;
    }
  }

  // If there is no cycle, return null
  if (fast === null || fast.next === null) {
    return null;
  }

  // Find the entry point of the cycle
  slow = head;
  while (slow !== fast) {
    slow = slow.next;
    fast = fast.next;
  }

  return slow;
};

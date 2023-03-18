function reverseLinkedList(head) {
  let prev = null;
  let current = head;
  while (current) {
    let next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }
  return prev;
}

const head = new ListNode(1, 2, 3, 4, 5);
console.log(reverseLinkedList(head));

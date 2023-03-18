function mergeTwoLists(list1, list2) {
  let newList = [...list1, ...list2];
  return newList.sort((a, b) => a - b);
}

function mergeTwoLists(list1, list2) {
  let dummy = new ListNode(0); // create a dummy node as the head of the new list
  let current = dummy; // set current to the dummy node

  // iterate through both lists until one of them is empty
  while (list1 && list2) {
    if (list1.val < list2.val) {
      current.next = list1; // add the node from list1 to the new list
      list1 = list1.next; // move to the next node in list1
    } else {
      current.next = list2; // add the node from list2 to the new list
      list2 = list2.next; // move to the next node in list2
    }
    current = current.next; // move current to the end of the new list
  }

  // add any remaining nodes from list1 or list2 to the new list
  if (list1) {
    current.next = list1;
  } else {
    current.next = list2;
  }

  return dummy.next; // return the head of the new list (after the dummy node)
}

const list1 = [1, 2, 4];
const list2 = [1, 3, 4];

console.log(mergeTwoLists(list1, list2));

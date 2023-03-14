var addTwoNumbers = function (l1, l2) {
  // Create string to concat int in list
  let list1 = "";
  for (let i = l1.length - 1; i >= 0; i--) {
    list1 += l1[i];
  }

  let list2 = "";
  for (let i = l2.length - 1; i >= 0; i--) {
    list2 += l2[i];
  }

  const sum = parseInt(list1) + parseInt(list2);
  const numArr = sum.toString().split("").reverse().map(Number);
  return numArr;
};

class ListNode {
  constructor(val, next = null) {
    this.val = val;
    this.next = next;
  }
}

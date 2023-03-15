// const addTwoNumbers = function (l1, l2) {
//   // Create string to concat int in list
//   let list1 = "";
//   for (let i = l1.length - 1; i >= 0; i--) {
//     list1 += l1[i];
//   }

//   let list2 = "";
//   for (let i = l2.length - 1; i >= 0; i--) {
//     list2 += l2[i];
//   }

//   const sum = parseInt(list1) + parseInt(list2);
//   const numArr = sum.toString().split("").reverse().map(Number);
//   return numArr;
// };

// class ListNode {
//   constructor(val, next = null) {
//     this.val = val;
//     this.next = next;
//   }
// }

class ListNode {
  constructor(val, next = null) {
    this.val = val;
    this.next = next;
  }
}

function addTwoNumbers(l1, l2) {
  let carry = 0;
  let head = new ListNode(0);
  let current = head;
  while (l1 || l2 || carry) {
    const sum = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + carry;
    carry = Math.floor(sum / 10);
    current.next = new ListNode(sum % 10);
    current = current.next;
    l1 = l1 && l1.next;
    l2 = l2 && l2.next;
  }
  return head.next;
}

const l1 = [2, 4, 3];
const l2 = [5, 6, 4];

console.log(addTwoNumbers(l1, l2));
